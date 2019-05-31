import java.io.File 

def fileName = 'examples/data/query_pedro.txt'

//My First Groovy script. Pardon me for any n00b mistakes
//This is simple and plain script that executes on single thread
//Not recommended for very large files as it takes a lot of time
 
//Path where the large file is present
directoryPath = 'C:\\Users\\jaime\\Desktop\\'
//Path where split files should be placed
splitPath = 'C:\\Users\\jaime\\Desktop\\Query\\'
filepath = 'query_pedro.txt'
filePrefix = 'split_query'
fileExtension = '.txt'
File dataFile = new File(directoryPath + filepath)
 
if(!dataFile.exists()){
  println "File no existe"
}else {
  i=0
  fileNumber = 0
  File fileToWrite = new File(splitPath + filePrefix + fileNumber + fileExtension)
  dataFile.eachLine{line->
  if(i>7000){
    i=0
    fileNumber+=1
    fileToWrite = new File(splitPath + filePrefix + fileNumber + fileExtension)
  }
  i=i+1
  fileToWrite << ("$line\r\n")
  }
}
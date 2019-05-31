import java.io.File 

def newFile = new File("C:/Users/jaime/Desktop/query_update.txt")
newFile.createNewFile() 

//Variables
def info_idEsterno = ["26_10002_95103263_20002423_1","26_10012_95314978_20002433_1"]
def descrizione = ["Contratto di finanziamento fondiario n. 76/90101410 di originari € 130.000,00 accollato per € 112.284,72", "intervento nell''esecuzione immobiliare del gruppo Edilnovaa"]


def z = ""
def querys =   info_idEsterno.withIndex().collect{ it, index ->
       z = """update laweb4.proceduralegale set descrizione = '${descrizione[index]}' where info_idesterno = '$it'; """ 
}    


def res = querys.join("\n")
newFile.write(res.toString())

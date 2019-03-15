import java.io.File 

def newFile = new File("C:/Users/jaime/Desktop/test.txt")
//C:\Users\jaime\Desktop
newFile.createNewFile() 

def IdinfoEntita_Arrays = [1, 2]
def query = ""
def querys_Array = []
def abc = ""

IdinfoEntita_Arrays.each{it ->
query = """ insert into laweb4.etichettaentita (audit_modifiedby, audit_modifieddate, audit_createdby, audit_createddate, etichetta, pubblica, version, elementoorganizzativo_id, infoentita_id) values (29,getdate(),29, getdate(), 'CESSIONE CATTLEYA', 1, 0 ,4560, $it)"""
querys_Array << query
    }
querys_Array.each{it ->
       abc = println "$it"
    }

def res = querys_Array.join("\n ")
newFile.write(res.toString())

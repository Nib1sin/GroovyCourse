def IdinfoEntita_Arrays = [1, 2]
def query = ""
def querys_Array = []
def resultado = ""

IdinfoEntita_Arrays.each{it ->
query = """
insert into laweb4.etichettaentita (audit_modifiedby, audit_modifieddate, audit_createdby, audit_createddate, etichetta, pubblica, version, elementoorganizzativo_id, infoentita_id) 
values (29,getdate(),29, getdate(), 'CESSIONE CATTLEYA', 1, 0 ,4560, $it)
"""
querys_Array << query
    }
querys_Array.each{it ->
       resultado = println "$it"
    }
resultado
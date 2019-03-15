def listaMappe = 
    [
        [id:0, nome:'mario'],
        [id:0, nome:'Paolo'],
        [id:0, nome:'luca'],
        [id:0, nome:'Gaetano'],
        [id:0, nome:'mario']
    ].groupBy{it.id}

def list = [
        [0, 'pep', '123456'],
        [0, 'asd', '654321'],
        [1, 'pep', '123456'],
        [1, 'asd', '654321']
    ].collectEntries{
        [(it[0]): [nome:it[1], number:it[2] ]]
    }

listaMappe
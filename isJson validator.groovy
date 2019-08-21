import it.sydema.laweb.domain.EntitaProcesso
import it.sydema.laweb.domain.Enums.Entita
import groovy.json.*
import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()

def a = '{"name": "John", "data": [{"id": 1},{"id": 2}]}'
def b = []
b << [[entita:'SOGGETTO_ANAGRAFICO', id:59706, text:'COOPERATIVA COSTRUZIONI SOCIETA', isSelected:true]]



def isJson = { String json ->
    try {
        JsonOutput.prettyPrint(json)
        return true
    } catch (ignored) {
        return false
    }
}


def esecutato = isJson(a.toString()) ? jsonSlurper.parseText(a) : a
//esecutato.name


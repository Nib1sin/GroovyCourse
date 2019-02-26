package test
import groovy.xml.MarkupBuilder
/**
 * A Simple Example that builds an XML document and saves the result to a file.
 */
class Test {
    static main(args) {
        def fileWriter = new FileWriter("c:/temp/testdb.xml")    // directorio donde se guardara el xml
        def peopleBuilder = new MarkupBuilder(fileWriter)
        peopleBuilder.people {
            person {
                firstName('John')
                lastName('Doe')
                age(25)
            }
            person {
                firstName('Jane')
                lastName('Smith')
                age(31)
            }
        }
        fileWriter.close();
    }
}
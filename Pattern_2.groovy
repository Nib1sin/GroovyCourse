
/*
    Si queremos extraer una parte de un url entre "http://www.espn.com/blog/" y "/"
*/



import java.util.regex.Pattern

def url = 'http://www.espn.com/blog/stephania-bell/post/_/id/3563/key-fantasy-football-injury-updates-for-week-4-2'

def pattern = Pattern.compile('^https?://www\\.espn\\.com/blog/([^/]+)/.*$')

def (_, blog) = (url =~ pattern)[0]

assert blog == 'stephania-bell'



/*
	Otra forma de hacer lo mismo
*/

@Grab('org.jsoup:jsoup:1.11.3')
import static org.jsoup.Jsoup.connect

def name = connect('http://www.espn.com/blog/stephania-bell/post/_/id/3563/key-fantasy-football-injury-updates-for-week-4-2')
  .get()
  .select('.sticky-header h1 a')
  .text()

assert name == 'Stephania Bell Blog'
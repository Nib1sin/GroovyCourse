emailPattern = /[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})/
email = 'nibi.amdukia@das.com'

return !(email ==~ emailPattern)
// debe retornar false ya que negamos la condicion


//Email Patter 2
def email = 'groovy1@gmail.s'
 
def exp =  /[a-zA-Z][^@\.]+@[^@\.]+\.[^@\.]+/
 
println email ==~ exp
 



//Email Patter 3 con una direccion especifica
def exp =  /[a-zA-Z][^@\.]+@[^@\.]+\.[^@\.]+/



//Match phone number
 
def phone = '12234256785'
def exp = /12[0-9]{9}/
 
println phone ==~ exp



//IN JAVA
/*
private static final String EMAIL_PATTERN = "[_A-Za-z0-9-]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})";

pattern = Pattern.compile(EMAIL_PATTERN);
return pattern.matcher("god@heaven.org");

*/


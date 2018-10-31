import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


def generator = { String alphabet, int n ->
  new Random().with {
    (1..n).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
  }
}


def pass = generator( (('0'..'9')+('A'..'Z')+('a'..'z')).join(), 8)
//def pass = generator( (('a'..'z')+('A'..'Z')+('@')+('!')+('0'..'9')).join(), 8)




String input = pass
MessageDigest md = MessageDigest.getInstance("MD5");
byte[] md5sum = md.digest(input.getBytes());
String output = String.format("%032X", new BigInteger(1, md5sum));


println "Your password is " + pass + " your encrypt password is " + output.toLowerCase()

println "Your password is " + pass + " your encrypt password is " + output


       
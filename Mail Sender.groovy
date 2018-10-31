/*
 
Get Any JAVAMAIL Dependency 
===============================
Download JAVAMAIL dependency that you need.
download JAVAMAIL at : https://maven.java.net/content/repositories/releases/com/sun/mail/javax.mail/1.5.2/javax.mail-1.5.2.jar
To install, copy & paste the *.jar to installed Groovy lib directory:
eg: C:\Program Files (x86)\Groovy\Groovy-2.1.1\lib
 
*/





//@Grab(group = 'com.sun.mail', module = 'javax.mail', version = '1.6.0')

import javax.mail.Message
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

MAILER_HOST = "smtpauth.sydema.it"
MAILER_USER = "smtp@sydema.it"
MAILER_PASS = "wUjRuRB5QCHa6eEcbL08"
MAILER_PORT = 25


private void runScript() {
    Session session = Session.getDefaultInstance(new Properties())

    MimeMessage message = new MimeMessage(session)
    message.setFrom("l.trovato@sydema.it")
    message.setRecipient(Message.RecipientType.TO, new InternetAddress("p.jaime@sydema.it"))
    message.setSubject("Mensaje Importante!")
    message.setText("Prova prova prova")

    Transport transport = session.getTransport("smtp")
    transport.connect(MAILER_HOST, MAILER_PORT, MAILER_USER, MAILER_PASS)
    transport.sendMessage(message, message.getAllRecipients())
    transport.close()
}

runScript()
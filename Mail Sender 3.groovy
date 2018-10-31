// @Grab(group = 'com.sun.mail', module = 'javax.mail', version = '1.6.0')


import javax.mail.*
import javax.mail.internet.*

MAILER_HOST = "smtp-relay.gmail.com"
date_time = new Date().format("dd-MM-yyyy hh:mm")
props = new Properties()

private void runScript() {
    props.put("mail.host", MAILER_HOST);
    Session session = Session.getDefaultInstance(props)
    session.setDebug(true);

    MimeMessage message = new MimeMessage(session)
    message.setFrom("no.reply@sydema.it")
    message.setRecipient(Message.RecipientType.TO, new InternetAddress("nibi.amdukia@gmail.com"))
    message.setSubject("prova email ${date_time}")
    message.setText("prova")

    Transport.send(message)
}

runScript()
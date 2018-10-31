
import java.nio.charset.StandardCharsets
import org.springframework.core.io.FileSystemResource
import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.mail.javamail.MimeMessageHelper

import org.slf4j.Logger
import org.slf4j.LoggerFactory


// da decommentare se si desidera che non partano le mail se il task viene simulato
//if (context.isSimulation())
//    return
def javaMailSender = null

javaMailSender = new JavaMailSenderImpl()
javaMailSender.defaultEncoding = StandardCharsets.UTF_8.name()
javaMailSender.host = 'indirizzo smtp'
javaMailSender.port = 25
/* da rimuovere questo blocco per invio senza autenticazione */
javaMailSender.username = 'user'
javaMailSender.password = 'passoword'
javaMailSender.javaMailProperties.put('mail.smtp.auth', 'true')
/* da rimuovere questo blocco per invio senza autenticazione */

def helper = new MimeMessageHelper(javaMailSender.createMimeMessage(), true)

helper.from = 'mittente'
helper.to = ['destinatario'] as String[]
helper.sentDate = new Date()
helper.subject = 'oggetto'
helper.text = 'testo mail'


//throw new Exception(">>>: "+context.getVariable('TIPO_MAIL')+"|"+context.getVariable('TSTO_MAIL_MNDNTPRDTTO')+"|"+context.getVariable('INDRZZO_MAIL')?.text)
javaMailSender.send(helper.mimeMessage)

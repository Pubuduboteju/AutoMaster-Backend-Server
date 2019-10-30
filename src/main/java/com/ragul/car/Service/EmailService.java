package com.ragul.car.Service;

import com.ragul.car.Model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender sender;
    public String sendMail(Email email) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        if(email.getEmailType().equals("serviceAppointment") ){
            try {
                helper.setTo(email.getEmail());
//            helper.setFrom(email.getEmail());
                helper.setText("Service Request From :" + email.getFirstName() +"\n"
                        + "Required service in brief :" +email.getOtherDetails() +"\n"
                        + "Email :" +email.getSenderEmail() +"\n"
                        + "Phone No. :" +email.getPhoneNo() +"\n"
                        +"\n"
                        + "---"  +"\n"
                        + "Best Regards"  +"\n"
                        + "Automaster Vehicle Consultancy"  +"\n"
                        + "automastervehicleconsultancy@gmail.com");
                helper.setSubject(email.getServiceRequired());
            } catch (MessagingException e) {
                e.printStackTrace();
                return "Error while sending mail ..";
            }
        }else if(email.getEmailType().equals("generalUserMessage") ){
            try {
                helper.setTo(email.getEmail());
//            helper.setFrom(email.getEmail());
                helper.setText("Name :" + email.getFirstName() + " " + email.getLastName() +"\n"
                        + "Email :" + email.getSenderEmail()  +"\n"
                        + "Message :" + email.getMessage());
                helper.setSubject(email.getSubject());
            } catch (MessagingException e) {
                e.printStackTrace();
                return "Error while sending mail ..";
            }
        }else{
            try {
                helper.setTo(email.getEmail());
//            helper.setFrom(email.getEmail());
                helper.setText("Dear "+ email.getFirstName()  +"\n"
                        +"\n"
                        + email.getMessage()  +"\n"
                        +"\n"
                        + "---"  +"\n"
                        + "Best Regards"  +"\n"
                        + "Automaster Vehicle Consultancy"  +"\n"
                        + "automastervehicleconsultancy@gmail.com");
                helper.setSubject(email.getSubject());
            } catch (MessagingException e) {
                e.printStackTrace();
                return "Error while sending mail ..";
            }
        }


        sender.send(message);
        return "Mail Sent Success!";
    }

//    private void sendmail() throws AddressException, MessagingException, IOException {
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("automastervehicleconsultancy@gmail.com", "<automaster123456789>");
//            }
//        });
//        Message msg = new MimeMessage(session);
//        msg.setFrom(new InternetAddress("automastervehicleconsultancy@gmail.com", false));
//
//        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("pubuduboteju95@gmail.com"));
//        msg.setSubject("Tutorials point email");
//        msg.setContent("Tutorials point email", "text/html");
//        msg.setSentDate(new Date());
//
//        MimeBodyPart messageBodyPart = new MimeBodyPart();
//        messageBodyPart.setContent("Tutorials point email", "text/html");
//
//        Multipart multipart = new MimeMultipart();
//        multipart.addBodyPart(messageBodyPart);
//        MimeBodyPart attachPart = new MimeBodyPart();
//
//        attachPart.attachFile("/var/tmp/image19.png");
//        multipart.addBodyPart(attachPart);
//        msg.setContent(multipart);
//        Transport.send(msg);
//    }

}

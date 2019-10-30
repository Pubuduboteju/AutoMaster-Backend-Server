package com.ragul.car.Controller;

import com.ragul.car.Model.Email;
import com.ragul.car.Service.EmailService;
import com.ragul.car.payload.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    EmailService emailService;

//    @RequestMapping(value = "/api/sendemail")
//    public String sendEmail() throws AddressException, MessagingException, IOException {
//        sendEmail();
//        return "Email sent successfully";
//    }
    @Autowired
    private JavaMailSender sender;

    @RequestMapping("/api/sendMail")
    public ResponseEntity<ApiResponse<Email>> sendMail(@RequestBody Email email){
        try{
            emailService.sendMail(email);
            return  new ResponseEntity<>(new ApiResponse<>(email), HttpStatus.OK);
        }catch (Exception ex){
            return  new ResponseEntity<>(new ApiResponse<>(email), HttpStatus.CONFLICT);
        }
    }


//    public String sendMail() {
//        MimeMessage message = sender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message);
//
//        try {
//            helper.setTo("pubuduboteju95@gmail.com");
//            helper.setText("Greetings :)");
//            helper.setSubject("Mail From Spring Boot");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//            return "Error while sending mail ..";
//        }
//        sender.send(message);
//        return "Mail Sent Success!";
//    }
}

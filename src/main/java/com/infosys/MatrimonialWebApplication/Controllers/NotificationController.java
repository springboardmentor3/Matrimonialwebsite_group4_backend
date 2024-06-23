package com.infosys.MatrimonialWebApplication.Controllers;

import com.infosys.MatrimonialWebApplication.entitites.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotificationController {
    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/send-notification")
    public String sendNotification(@RequestBody NotificationRequest request) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(request.getEmail());
        message.setSubject("Notification");
        message.setText(request.getMessage());
        mailSender.send(message);
        return "Notification sent successfully!";
    }
}

package com.infosys.MatrimonialWebApplication.Controllers;




import com.infosys.MatrimonialWebApplication.Service.EmailService;
import com.infosys.MatrimonialWebApplication.Service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EmailVerificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-verification-email")
    public void sendVerificationEmail(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        emailService.sendVerificationEmail(email);
    }

    @PostMapping("/verify-code")
    public boolean verifyCode(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        String code = request.get("code");
        return emailService.verifyCode(email, code);
    }
}
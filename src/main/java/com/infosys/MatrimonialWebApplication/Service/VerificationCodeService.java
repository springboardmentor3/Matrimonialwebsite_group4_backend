package com.infosys.MatrimonialWebApplication.Service;



import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class VerificationCodeService {

    private Map<String, String> verificationCodes = new HashMap<>();

    public String generateCode(String email) {
        String code = UUID.randomUUID().toString();
        verificationCodes.put(email, code);
        return code;
    }

    public boolean verifyCode(String email, String code) {
        return code.equals(verificationCodes.get(email));
    }
}

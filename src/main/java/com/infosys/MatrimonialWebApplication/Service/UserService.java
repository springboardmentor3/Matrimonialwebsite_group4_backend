package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public  User createUser(User user) throws Exception;

    public User getUser(String email);

    public Optional<User> getUserbyId(Long id);

    public void deleteUser(Long id);
    public List<User> getAllUser() ;
    public void updateUserPassword(String email, String newPassword);




}


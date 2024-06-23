package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AdminService {
    public Admin createAdmin(Admin user) throws Exception;

    public Admin getAdmin(Long adminid);

//    public Optional<User> getUserbyId(Long id);
//
//    public void deleteUser(Long id);
    public List<Admin> getAllaAdmins() ;

}


package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.AdminService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceimpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin createAdmin(Admin admin) throws Exception {
        Admin local =  this.adminRepository.findByAdminid(admin.getAdminid());
        if(local!=null){
            System.out.println("User already present");
            throw new Exception("User already exists");
        }else{
            local =  this.adminRepository.save(admin);
        }
        return local;
    }

    @Override
    public Admin getAdmin(Long adminid) {
        return this.adminRepository.findByAdminid(adminid);
    }

    @Override
    public List<Admin> getAllaAdmins() {
        return this.adminRepository.findAll();
    }


//    @Override
//    public Optional<User> getUserbyId(Long id) {
//        return this.userRepository.findById(id);
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//        this.userRepository.deleteById(id);
//
//    }
//
//    @Override
//
//


}


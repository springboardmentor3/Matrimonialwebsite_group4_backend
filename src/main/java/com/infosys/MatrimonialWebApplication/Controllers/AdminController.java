package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.AdminService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.Admin;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/")
    public Admin createAdmin(@RequestBody Admin admin) throws Exception {
        return this.adminService.createAdmin(admin);

    }

    @GetMapping("/{adminid}")
    public Admin  getAdmin(@PathVariable("adminid") Long adminid){
        return this.adminService.getAdmin(adminid);
    }

//    @GetMapping("/get/{id}")
//    public Optional<User> getUserbyId(@PathVariable("id") Long id){
//        return this.userService.getUserbyId(id);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable("id") Long id){
//        this.userService.deleteUser(id);
//
//    }
//
    @GetMapping("/admins")
    public List<Admin> getAllAdmin() {
        return this.adminService.getAllaAdmins();
    }


}

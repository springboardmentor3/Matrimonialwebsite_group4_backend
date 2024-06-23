package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

        @PostMapping("/")
        public User createUser(@RequestBody User user) throws Exception {
            return this.userService.createUser(user);

        }

        @GetMapping("/{email}")
    public User getUser(@PathVariable("email") String email){
            return this.userService.getUser(email);
        }

    @GetMapping("/get/{id}")
    public Optional<User> getUserbyId(@PathVariable("id") Long id){
        return this.userService.getUserbyId(id);
    }


    @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable("id") Long id){
            this.userService.deleteUser(id);

        }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return this.userService.getAllUser();
    }

    @PutMapping("/{email}/{newPassword}")
    public ResponseEntity<?> updateUserPassword(@PathVariable String email, @PathVariable String newPassword) {
        try {
            userService.updateUserPassword(email, newPassword);
            return new ResponseEntity<>("Password updated successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}

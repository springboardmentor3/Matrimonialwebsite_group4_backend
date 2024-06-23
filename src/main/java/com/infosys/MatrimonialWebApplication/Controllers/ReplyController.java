package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.ContactService;
import com.infosys.MatrimonialWebApplication.Service.ReplyService;
import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.Contact;
import com.infosys.MatrimonialWebApplication.entitites.Reply;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reply")
@CrossOrigin("*")
public class ReplyController {

    @Autowired
    private ReplyService  replyService;

    @PostMapping("/")
    public Reply createReply(@RequestBody Reply reply) throws Exception {
        return this.replyService.createReply(reply);

    }

    @GetMapping("/{email}")
    public Reply getReply(@PathVariable("email") String email){
        return this.replyService.getReply(email);
    }

//    @GetMapping("/get/{id}")
//    public Optional<Reply> getReplybyId(@PathVariable("id") Long id){
//        return this.replyService.getReplybyId(id);
//    }


    @DeleteMapping("/{id}")
    public void deleteReply(@PathVariable("id") Long id){
        this.replyService.deleteReply(id);

    }

    @GetMapping("/replies")
    public List<Reply> getAllReply() {
        return this.replyService.getAllReply();
    }

    @GetMapping("/has-new-replies/{id}")
    public boolean hasNewReplies(@PathVariable("id") Long id) {
        return replyService.hasNewReplies(id);
    }


    @GetMapping("/replies/{rid}")
    public List<Reply> getAllRepliesByRid(@PathVariable Long rid) {
        return replyService.getAllRepliesByRid(rid);
    }




}

class ReplyResponse {
    private boolean hasNewReplies;

    public ReplyResponse(boolean hasNewReplies) {
        this.hasNewReplies = hasNewReplies;
    }

    public boolean isHasNewReplies() {
        return hasNewReplies;
    }

    public void setHasNewReplies(boolean hasNewReplies) {
        this.hasNewReplies = hasNewReplies;
    }
}

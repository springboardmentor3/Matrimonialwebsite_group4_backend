package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.MessageService;
import com.infosys.MatrimonialWebApplication.entitites.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/message")
@CrossOrigin("*")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/")
    public Optional<Message> createMessage(@RequestBody Message message) throws Exception {
        return this.messageService.createMessage(message);

    }

    @GetMapping("/{recrid}")
    public List<Message> getMessage(@PathVariable("recrid") Long recrid){
        return this.messageService.getMessage(recrid);
    }

    @GetMapping("/get/{sendrid}")
    public List<Message> getsendMessage(@PathVariable("sendrid") Long sendrid){
        return this.messageService.getMessage1(sendrid);
    }


    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable("id") Long id){
        this.messageService.deleteMessage(id);

    }

    @PostMapping("/{recrid}/approve")
    public void approveMessage(@PathVariable Long recrid) {
        messageService.updateAllMessagesApprovalStatus(recrid);
    }

}

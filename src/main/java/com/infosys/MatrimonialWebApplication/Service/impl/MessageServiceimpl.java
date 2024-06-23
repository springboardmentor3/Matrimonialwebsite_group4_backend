package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.MessageService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceimpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Optional<Message> createMessage(Message message) throws Exception {
//        Optional<Message> local =  this.messageRepository.findById(message.getId());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");

        Optional<Message>  local = Optional.of(this.messageRepository.save(message));

        return local;
    }


    @Override
    public List<Message> getMessage(Long id) {
        return this.messageRepository.findByRecrid(id);
    }

    @Override
    public List<Message> getMessage1(Long id) {
        return this.messageRepository.findBySendrid(id);
    }


    @Override
    public void deleteMessage(Long id) {
        this.messageRepository.deleteById(id);
    }

    public void updateAllMessagesApprovalStatus(Long recrid) {
        List<Message>   messages = messageRepository.findByRecrid(recrid);
        for (Message message : messages) {
            message.setApprovedStatus(Message.YesNo.YES);
        }
        messageRepository.saveAll(messages);
    }
}


package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.ReplyService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReplyServiceimpl implements ReplyService {

    @Autowired
    private ReplyRepository replyRepository;

    @Override
    public Reply createReply(Reply reply ) throws Exception {

        Reply local = this.replyRepository.save(reply);

        return local;
    }

    @Override
    public boolean hasNewReplies(Long Id) {
        List<Reply> newReplies = replyRepository.findByIdAndIsNewTrue(Id);
        return !newReplies.isEmpty();
    }


    @Override
    public Reply getReply(String email) {
        return this.replyRepository.findByEmail(email);
    }

//    @Override
//    public Optional<Reply> getReplybyId(Long id) {
//        return this.replyRepository.findById(id);
//    }

    @Override
    public void deleteReply(Long id) {
        this.replyRepository.deleteById(id);

    }

    @Override


    public List<Reply> getAllReply() {

        return this.replyRepository.findAll();
    }

    @Override
    public List<Reply> getAllRepliesByRid(Long rid) {
        return replyRepository.findByRid(rid);
    }


}


package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReplyService {

    public Reply createReply (Reply reply ) throws Exception;

    public Reply  getReply (String email);

//    public Optional<Reply> getReplybyId(Long id);

    public void deleteReply (Long id);
    public List<Reply> getAllReply() ;
    List<Reply> getAllRepliesByRid(Long rid);

   public boolean hasNewReplies(  Long Id);




}


package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public interface MessageService {


    public Optional<Message> createMessage(Message message) throws Exception;

    public List<Message> getMessage(Long id);

    public List<Message> getMessage1(Long id);

    public void deleteMessage(Long id);

    public void updateAllMessagesApprovalStatus(Long recrid);


}


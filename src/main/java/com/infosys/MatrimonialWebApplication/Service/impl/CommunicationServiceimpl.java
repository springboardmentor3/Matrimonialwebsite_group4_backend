//package com.infosys.MatrimonialWebApplication.Service.impl;
//
//import com.infosys.MatrimonialWebApplication.Service.CommunicationService;
//import com.infosys.MatrimonialWebApplication.entitites.*;
//import com.infosys.MatrimonialWebApplication.repo.*;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CommunicationServiceimpl implements CommunicationService {
//
//    @Autowired
//    private CommunicationRepository communicationRepository;
//
//    @Override
//    public Communication createCommunication(Communication communication) throws Exception {
//        Communication local =  this.communicationRepository.findByRec_rid(communication.getRec_rid());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");
//        }else{
//            local =  this.communicationRepository.save(communication);
//        }
//        return local;
//    }
//
//    @Override
//    public Communication getCommunication(Long rec_rid) {
//        return this.communicationRepository.findByRec_rid(rec_rid);
//    }
//
//    @Override
//    public void deleteCommunication(Long Id) {
//        this.communicationRepository.deleteById(Id);
//
//    }
//
//    @Override
//
//
//    public List<Communication> getAllCommunication() {
//
//        return this.communicationRepository.findAll();
//    }
//}
//

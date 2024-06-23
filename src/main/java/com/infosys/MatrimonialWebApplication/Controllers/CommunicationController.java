//package com.infosys.MatrimonialWebApplication.Controllers;
//
//
//import com.infosys.MatrimonialWebApplication.Service.CommunicationService;
//
//import com.infosys.MatrimonialWebApplication.entitites.Communication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/communication")
//@CrossOrigin("*")
//public class CommunicationController {
//
//    @Autowired
//    private CommunicationService communicationService;
//
//    @PostMapping("/")
//    public Communication createCommunication(@RequestBody Communication communication) throws Exception {
//        return this.communicationService.createCommunication(communication);
//
//    }
//
//    @GetMapping("/{recv_rid}")
//    public Communication getCommunication(@PathVariable("recv_rid") Long recv_rid){
//        return this.communicationService.getCommunication(recv_rid);
//    }
//
//    @DeleteMapping("/{Id}")
//    public void deleteCommunication(@PathVariable("Id") Long Id){
//        this.communicationService.deleteCommunication(Id);
//
//    }
//
//    @GetMapping("/commmunications")
//    public List<Communication> getAllCommunication() {
//        return this.communicationService.getAllCommunication();
//    }
//
//
//}

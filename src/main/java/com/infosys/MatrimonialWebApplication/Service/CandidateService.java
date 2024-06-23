package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CandidateService {
    public Candidate createCandidate(Candidate candidate) throws Exception;

    public Candidate getCandidate(Long candid);

//    public Optional<User> getUserbyId(Long id);

    public void deleteCandidate(Long candid);
    public List<Candidate> getAllCandidate() ;

    Candidate updateCandidate(Candidate candidate) throws Exception;

}


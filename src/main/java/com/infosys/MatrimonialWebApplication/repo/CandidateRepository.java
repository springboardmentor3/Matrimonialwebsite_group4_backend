package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Candidate;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    public Candidate findByCandid(Long candid);
//    public Optional<Candidate> findById(Long Id);
}

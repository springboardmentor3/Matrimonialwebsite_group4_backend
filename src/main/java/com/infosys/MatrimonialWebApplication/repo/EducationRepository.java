package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Education;
import com.infosys.MatrimonialWebApplication.entitites.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EducationRepository extends JpaRepository<Education,Long> {

    public Optional<Education> findByrId(Long id);
}

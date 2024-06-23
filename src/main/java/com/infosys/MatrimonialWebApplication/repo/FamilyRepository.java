package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Family;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FamilyRepository extends JpaRepository<Family,Long> {

    public Optional<Family> findByRId(Long rId);
}

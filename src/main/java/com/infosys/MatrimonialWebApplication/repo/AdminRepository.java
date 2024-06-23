package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Admin;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AdminRepository extends JpaRepository<Admin,Long> {

    public Admin findByAdminid(Long adminid);

}

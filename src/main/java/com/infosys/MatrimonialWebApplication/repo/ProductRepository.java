package com.infosys.MatrimonialWebApplication.repo;


import com.infosys.MatrimonialWebApplication.entitites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
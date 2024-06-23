package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ReplyRepository extends JpaRepository<Reply,Long> {
    public  Reply findByEmail(String email);


//    public Optional<Reply> findById(Long Id);
    List<Reply> findByIdAndIsNewTrue(Long id);
//    public List<Optional<Reply>> findById(Long Id);





   List<Reply> findByRid(Long Id);

}

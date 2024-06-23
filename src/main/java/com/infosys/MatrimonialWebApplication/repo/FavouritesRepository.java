package com.infosys.MatrimonialWebApplication.repo;

import com.infosys.MatrimonialWebApplication.entitites.Favourites;
import com.infosys.MatrimonialWebApplication.entitites.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FavouritesRepository extends JpaRepository<Favourites,Long> {

    public List<Favourites> findByRecrid(Long recrid);
    public List<Favourites> findBySendrid(Long send_rid);


}

package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.FavouritesService;
import com.infosys.MatrimonialWebApplication.Service.MessageService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavouritesServiceimpl implements FavouritesService {

    @Autowired
    private FavouritesRepository favouritesRepository;

    @Override
    public Optional<Favourites> createFavourites(Favourites favourites) throws Exception {
//        Optional<Message> local =  this.messageRepository.findById(message.getId());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");

        Optional<Favourites>  local = Optional.of(this.favouritesRepository.save(favourites));

        return local;
    }


    @Override
    public List<Favourites> getFavourites(Long id) {
        return this.favouritesRepository.findByRecrid(id);
    }

    @Override
    public List<Favourites> getFavourites1(Long id) {
        return this.favouritesRepository.findBySendrid(id);
    }


    @Override
    public void deleteFavourites(Long id) {
        this.favouritesRepository.deleteById(id);
    }


}


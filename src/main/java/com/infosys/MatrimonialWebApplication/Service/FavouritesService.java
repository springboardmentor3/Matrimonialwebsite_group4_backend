package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public interface FavouritesService {


    public Optional<Favourites> createFavourites(Favourites favourites) throws Exception;

    public List<Favourites> getFavourites(Long id);

    public List<Favourites> getFavourites1(Long id);

    public void deleteFavourites(Long id);




}


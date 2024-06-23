package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.FavouritesService;
import com.infosys.MatrimonialWebApplication.entitites.Favourites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/favourites")
@CrossOrigin("*")
public class FavouritesController {

    @Autowired
    private FavouritesService favouritesService;

    @PostMapping("/")
    public Optional<Favourites> createFavourites(@RequestBody Favourites favourites) throws Exception {
        return this.favouritesService.createFavourites(favourites);

    }

    @GetMapping("/{recrid}")
    public List<Favourites> getFavourites(@PathVariable("recrid") Long recrid){
        return this.favouritesService.getFavourites(recrid);
    }

    @GetMapping("/get/{sendrid}")
    public List<Favourites> getsendFavourites(@PathVariable("sendrid") Long sendrid){
        return this.favouritesService.getFavourites1(sendrid);
    }


    @DeleteMapping("/{id}")
    public void deleteFavourites(@PathVariable("id") Long id){
        this.favouritesService.deleteFavourites(id);

    }

//    @PostMapping("/{recrid}/approve")
//    public void approveMessage(@PathVariable Long recrid) {
//        messageService.updateAllMessagesApprovalStatus(recrid);
//    }

}

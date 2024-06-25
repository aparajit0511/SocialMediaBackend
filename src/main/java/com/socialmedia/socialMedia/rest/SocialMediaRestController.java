package com.socialmedia.socialMedia.rest;

import com.socialmedia.socialMedia.entity.SocialMedia;
import com.socialmedia.socialMedia.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class SocialMediaRestController {

    private SocialMediaService socialMediaService;

    public SocialMediaRestController(SocialMediaService theSocialMediaService){
        socialMediaService = theSocialMediaService;
    }

    @GetMapping("/")
    public List<SocialMedia> findAll(){
        return socialMediaService.findAll();
    }

    @PostMapping("/socialmedia")
    public SocialMedia addNewPost(@RequestBody SocialMedia socialMedia){
        socialMedia.setId(0);
        SocialMedia dbMedia = socialMediaService.save(socialMedia);
        return dbMedia;
    }
}

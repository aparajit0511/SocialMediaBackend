package com.socialmedia.socialMedia.rest;

import com.socialmedia.socialMedia.entity.SocialMedia;
import com.socialmedia.socialMedia.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

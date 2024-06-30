package com.socialmedia.socialMedia.rest;

import com.socialmedia.socialMedia.entity.SocialMedia;
import com.socialmedia.socialMedia.service.SocialMediaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/socialmedia")
    public SocialMedia updatePost(@RequestBody SocialMedia socialMedia){
        return socialMediaService.save(socialMedia);
    }

    @GetMapping("/socailmedia/{findID}")
    public Optional<SocialMedia> findById(@PathVariable int findID){
        Optional<SocialMedia> findId = socialMediaService.findById(findID);

        if(findId == null){
            throw new RuntimeException("ID not found");
        }
        return findId;
    }

    @DeleteMapping("/socialmedia/{postID}")
    public void deleteById(@PathVariable int postID){

        Optional<SocialMedia> posts = socialMediaService.findById(postID);

        socialMediaService.deleteById(postID);
    }
}

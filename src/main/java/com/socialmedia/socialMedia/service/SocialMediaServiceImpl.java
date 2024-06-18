package com.socialmedia.socialMedia.service;

import com.socialmedia.socialMedia.dao.SocialMediaRepository;
import com.socialmedia.socialMedia.entity.SocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialMediaServiceImpl implements SocialMediaService {

    private SocialMediaRepository socialMediaRepository;

    @Autowired
    public SocialMediaServiceImpl(SocialMediaRepository theSocialMediaRepository){
        socialMediaRepository = theSocialMediaRepository;
    }

    public List<SocialMedia> findAll(){

        return socialMediaRepository.findAll();
    }


}

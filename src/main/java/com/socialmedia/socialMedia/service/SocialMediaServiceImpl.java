package com.socialmedia.socialMedia.service;

import com.socialmedia.socialMedia.dao.SocialMediaRepository;
import com.socialmedia.socialMedia.entity.SocialMedia;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Transactional
    @Override
    public SocialMedia save(SocialMedia socialMedia){

        return socialMediaRepository.save(socialMedia);

    }

    @Override
    public Optional<SocialMedia> findById(int theId){
        return socialMediaRepository.findById(theId);
    }

    @Transactional
    @Override
    public void deleteById(int theId){
         socialMediaRepository.deleteById(theId);
    }


}

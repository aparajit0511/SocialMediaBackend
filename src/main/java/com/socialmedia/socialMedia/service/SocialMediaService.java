package com.socialmedia.socialMedia.service;

import com.socialmedia.socialMedia.entity.SocialMedia;

import java.util.List;
import java.util.Optional;

public interface SocialMediaService {

    List<SocialMedia> findAll();

    SocialMedia save(SocialMedia socialMedia);

    void deleteById(int theId);

    Optional<SocialMedia> findById(int theId);

}

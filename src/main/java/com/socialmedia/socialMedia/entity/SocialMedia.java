package com.socialmedia.socialMedia.entity;

import jakarta.persistence.*;

@Entity
@Table(name="socialmedia")
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @Column(name="post_title")
    private String postName;

    @Column(name="description")
    private String description;

    public SocialMedia(){}

    public SocialMedia(int id, String postName,String description){
        this.id = id;
        this.postName = postName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SocialMedia{" +
                "id=" + id +
                ", postName='" + postName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

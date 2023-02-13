package com.bmuralir.rest.webservices.restfulwebservices.jpa; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmuralir.rest.webservices.restfulwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

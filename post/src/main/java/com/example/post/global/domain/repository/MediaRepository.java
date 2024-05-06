package com.example.post.global.domain.repository;

import com.example.post.global.domain.entity.Media;
import com.example.post.global.domain.entity.MediaPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {
}

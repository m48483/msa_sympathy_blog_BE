package com.example.post.global.domain.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="CATEGORIES")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CATEGORY_ID")
    private Long id;

    @Column(name="CATEGORY_NAME")
    @Setter
    private String categoryName;

    @JoinColumn(name = "USER_ID")
    @ManyToOne
    private UserBlog userBlog;

}

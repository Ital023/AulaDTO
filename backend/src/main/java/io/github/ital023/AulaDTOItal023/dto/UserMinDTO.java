package io.github.ital023.AulaDTOItal023.dto;

import io.github.ital023.AulaDTOItal023.entities.User;

public class UserMinDTO {

    private Long id;
    private String username;
    private String imgUrl;

    public UserMinDTO() {
    }

    public UserMinDTO(Long id, String username, String imgUrl) {
        this.id = id;
        this.username = username;
        this.imgUrl = imgUrl;
    }

    public UserMinDTO(User entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}

package io.github.ital023.AulaDTOItal023.dto;

import io.github.ital023.AulaDTOItal023.entities.User;

public class UserMinDTO {

    private Long id;
    private String username;
    private String img_url;

    public UserMinDTO() {
    }

    public UserMinDTO(Long id, String username, String img_url) {
        this.id = id;
        this.username = username;
        this.img_url = img_url;
    }

    public UserMinDTO(User entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.img_url = entity.getImg_url();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getImg_url() {
        return img_url;
    }
}

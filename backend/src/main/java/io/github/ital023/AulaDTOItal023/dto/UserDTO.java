package io.github.ital023.AulaDTOItal023.dto;

import io.github.ital023.AulaDTOItal023.entities.User;

public class UserDTO {

    private Long id;
    private String username;
    private String description;
    private String email;
    private String imgUrl;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String description, String email, String imgUrl) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.email = email;
        this.imgUrl = imgUrl;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.description = entity.getDescription();
        this.email = entity.getEmail();
        this.imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}

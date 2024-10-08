package io.github.ital023.AulaDTOItal023.dto;

import io.github.ital023.AulaDTOItal023.entities.User;

public class UserDTO {

    private Long id;
    private String username;
    private String description;
    private String email;
    private String img_url;

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String description, String email, String img_url) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.email = email;
        this.img_url = img_url;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.description = entity.getDescription();
        this.email = entity.getEmail();
        this.img_url = entity.getImg_url();
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

    public String getImg_url() {
        return img_url;
    }
}

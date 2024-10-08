package io.github.ital023.AulaDTOItal023.dto;

import io.github.ital023.AulaDTOItal023.entities.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateUserDTO {

    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, max = 50, message = "Nome precisa de 3 a 50 caracteres")
    private String username;

    @NotBlank(message = "Campo requerido")
    @Size(min = 10, max = 250, message = "Nome precisa de 3 a 250 caracteres")
    private String description;

    @NotBlank(message = "Campo requerido")
    private String password;

    @Email
    private String email;

    private String img_url;

    public CreateUserDTO() {
    }

    public CreateUserDTO(Long id, String username, String description, String password, String email, String img_url) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.password = password;
        this.email = email;
        this.img_url = img_url;
    }

    public CreateUserDTO(User entity) {
        this.id = entity.getId();
        this.username = entity.getUsername();
        this.description = entity.getDescription();
        this.password = entity.getPassword();
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

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getImg_url() {
        return img_url;
    }
}

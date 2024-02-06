package br.com.agnesia.app.agnesia_application.modules.users;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserEntity {

    private UUID id;
    private String bio;
    private String uploadData;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "[username] field do not accept spaces")
    private String username;
    @Email(message = "[email] field only accetps valid emails")
    private String email;
    @Length(min = 8, max = 256)
    private String password;

}

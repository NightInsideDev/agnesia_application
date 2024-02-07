package br.com.agnesia.app.agnesia_application.modules.users;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "agnuser")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String bio;
    private String uploadData;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "[username] field do not accept spaces")
    private String username;
    @Email(message = "[email] field only accetps valid emails")
    private String email;
    @Length(min = 8, max = 256, message = "A senha deve conter um mínimo de (8) caracteres")
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
 
}

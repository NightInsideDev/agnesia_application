package br.com.agnesia.app.agnesia_application.modules.users;

import java.util.UUID;
import lombok.Data;

@Data
public class UserEntity {

    private UUID id;
    private String name;
    private String username;
    private String email;
    private String bio;
    private String uploadData;
    private String password;

    
}

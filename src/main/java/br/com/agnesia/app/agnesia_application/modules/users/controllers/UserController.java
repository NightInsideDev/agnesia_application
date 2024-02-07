package br.com.agnesia.app.agnesia_application.modules.users.controllers;

import org.springframework.web.bind.annotation.RestController;
import br.com.agnesia.app.agnesia_application.modules.users.UserEntity;
import br.com.agnesia.app.agnesia_application.modules.users.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/")
    public UserEntity create(@Valid @RequestBody UserEntity userEntity) {

       return this.userRepository.save(userEntity);

    }
    
}

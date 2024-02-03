package br.com.agnesia.app.agnesia_application.modules.users.controllers;

import org.springframework.web.bind.annotation.RestController;
import br.com.agnesia.app.agnesia_application.modules.users.UserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/")
    public void create( @RequestBody UserEntity userEntity) {

        System.out.println("User");
        System.out.println(userEntity.getName());

    }
    
}

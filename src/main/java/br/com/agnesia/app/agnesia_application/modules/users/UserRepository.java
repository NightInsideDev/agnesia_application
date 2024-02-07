package br.com.agnesia.app.agnesia_application.modules.users;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {


    
}

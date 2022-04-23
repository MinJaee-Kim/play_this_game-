package Kuportfolio.playthisgame;

import Kuportfolio.playthisgame.Repository.GameRepository;
import Kuportfolio.playthisgame.Repository.JpaGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private EntityManager entityManager;

    @Autowired
    public SpringConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Bean
    public GameRepository gameRepository(){
        return new JpaGameRepository(entityManager);
    }

}

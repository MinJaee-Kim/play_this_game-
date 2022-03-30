package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface gamedeRepository extends JpaRepository<game,Long> {
    List<game> findAll();
}

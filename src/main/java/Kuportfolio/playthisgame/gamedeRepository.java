package Kuportfolio.playthisgame;

import Kuportfolio.playthisgame.gamede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface gamedeRepository extends JpaRepository<gamede,Long> {
    List<gamede> findAll();
}

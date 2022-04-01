package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GamedeRepository extends JpaRepository<Game,Long> {
    List<Game> findAll();
    @Query(value = "from Game g where g.casual=:casual")
    List<Game> getRecGame(@Param("casual") Integer casual);
}

package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GamedeRepository extends JpaRepository<Game,Long> {
    List<Game> findAll();

    @Query(value = " from Game g " +
            "where g.casual=:casual and g.collect=:collect and g.tech=:tech and g.collabo =:collabo and g.challenge = :challenge and g.story = :story")
    List<Game> findByCasualBetween(@Param("casual") Integer casual
            , @Param("collect") Integer collect
            , @Param("tech") Integer tech
            , @Param("collabo") Integer collabo
            , @Param("challenge") Integer challenge
            , @Param("story") Integer story);

}


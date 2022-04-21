package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GamedeRepository extends JpaRepository<Game,Long> {
    List<Game> findAll();

    @Query(value =  "from Game g where g.casual between (:casual-3) and (:casual+3) and g.collect between (:collect-3) and (:collect+3)" +
            "and g.tech between (:tech-3) and (:tech+3) and g.collabo between (:collabo-3) and (:collabo+3) and g.challenge between (:challenge-3) and (:challenge+3)" +
            "and g.story between (:story-3) and (:story+3)")
    List<Game> findByCasualBetween(@Param("casual") Integer casual
            , @Param("collect") Integer collect
            , @Param("tech") Integer tech
            , @Param("collabo") Integer collabo
            , @Param("challenge") Integer challenge
            , @Param("story") Integer story);

    @Query(value = "select count(g.id) from Game g where g.casual between (:casual-3) and (:casual+3) and g.collect between (:collect-3) and (:collect+3)" +
             "and g.tech between (:tech-3) and (:tech+3) and g.collabo between (:collabo-3) and (:collabo+3) and g.challenge between (:challenge-3) and (:challenge+3)" +
             "and g.story between (:story-3) and (:story+3)")
    Integer countId(@Param("casual") Integer casual
            , @Param("collect") Integer collect
            , @Param("tech") Integer tech
            , @Param("collabo") Integer collabo
            , @Param("challenge") Integer challenge
            , @Param("story") Integer story);





}


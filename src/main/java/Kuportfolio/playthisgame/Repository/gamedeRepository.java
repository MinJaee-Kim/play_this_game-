package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface gamedeRepository extends JpaRepository<game,Long> {
    List<game> findAll();
    @Query(value = "from game g where g.casual=:casual")
    List<game> getRecGame(@Param("casual") Integer casual);
}

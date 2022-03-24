package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.gamede;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public interface GamedeRepository {
    gamede save(gamede member);
    Optional<gamede> findById(Long id);
    Optional<gamede> findByName(String name);
    List<gamede> findAll();

}

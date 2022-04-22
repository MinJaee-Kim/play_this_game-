package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.dto.GameDTO;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public interface GameRepository {
    List<Game> findAll();
    List<Game> findOnea(GameDTO dto);
    List<Game> findTwo(GameDTO dto);
}

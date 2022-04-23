package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.dto.GameDTO;
import java.util.List;

public interface GameRepository {
    List<Game> findAll();
    List<Game> findBetween(GameDTO dto);
    List<Game> findBetweenWide(GameDTO dto);
    List<Game> findBetweenWide2(GameDTO dto);
    long CountBetween(GameDTO dto);
    long CountBetweenWide(GameDTO dto);
    long CountBetweenWide2(GameDTO dto);
}

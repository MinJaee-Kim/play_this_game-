package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.dto.GameDTO;
import java.util.List;

public interface GameRepository {
    List<Game> findAll();
    List<Game> findOne(long id);
    List CountAll();
    List CountBetween(GameDTO dto);
    List CountBetweenWide(GameDTO dto);
    List CountBetweenWide2(GameDTO dto);
}

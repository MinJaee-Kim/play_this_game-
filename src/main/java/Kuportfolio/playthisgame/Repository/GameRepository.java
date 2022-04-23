package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.dto.GameDTO;
import java.util.List;

public interface GameRepository {
    List<Game> findAll();
    List<Game> findTwo(GameDTO dto);
}

package Kuportfolio.playthisgame.Service;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.Repository.GameRepository;
import Kuportfolio.playthisgame.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamedeService {

    @Autowired
    GameRepository repository;

    public List<Game> findAll() {
        return repository.findAll();
    }

    public List<Game> findTwo(GameDTO dto) {return repository.findTwo(dto);}
}

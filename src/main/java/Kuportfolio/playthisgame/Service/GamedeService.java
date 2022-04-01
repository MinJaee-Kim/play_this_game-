package Kuportfolio.playthisgame.Service;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.Repository.GamedeRepository;
import Kuportfolio.playthisgame.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamedeService {

    @Autowired
    GamedeRepository repository;

    public List<Game> getAllgame(){
        return repository.findAll();
    }

    public List<Game> getRecGame(GameDTO dto){
        return repository.getRecGame(dto.getCasual());
    }
}
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

    public List<Game> findOne(long id) {
        return repository.findOne(id);
    }

    public List CountAll() {
        return repository.CountAll();
    }

    public List CountBetween(GameDTO dto) {return repository.CountBetween(dto);}

    public List CountBetweenWide(GameDTO dto) {return repository.CountBetweenWide(dto);}

    public List CountBetweenWide2(GameDTO dto) {return repository.CountBetweenWide2(dto);}
}

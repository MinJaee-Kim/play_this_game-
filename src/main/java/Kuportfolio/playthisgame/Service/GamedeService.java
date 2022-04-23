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

    public List<Game> findBetween(GameDTO dto) {return repository.findBetween(dto);}

    public List<Game> findBetweenWide(GameDTO dto) {return repository.findBetweenWide(dto);}

    public List<Game> findBetweenWide2(GameDTO dto) {return repository.findBetweenWide2(dto);}

    public Long CountBetween(GameDTO dto) {return repository.CountBetween(dto);}

    public Long CountBetweenWide(GameDTO dto) {return repository.CountBetweenWide(dto);}

    public Long CountBetweenWide2(GameDTO dto) {return repository.CountBetweenWide2(dto);}
}

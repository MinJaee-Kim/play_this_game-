package Kuportfolio.playthisgame.Service;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.Repository.GameRepository;
import Kuportfolio.playthisgame.Repository.GamedeRepository;
import Kuportfolio.playthisgame.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamedeService {

    @Autowired
    GameRepository repository;

//    public int getCount(GameDTO dto){
//        return repository.countId(dto.getCasual(),dto.getCollect(),dto.getTech(),dto.getCollabo(),dto.getChallenge(), dto.getStory());
//    }

//    public List<Game> getAllgame(){
//        return repository.findAll();
//    }

//    public List<Game> getRecGame(GameDTO dto){
//        return repository.findOne(dto.getCasual(),dto.getCollect(),dto.getTech(),dto.getCollabo(),dto.getChallenge(), dto.getStory());
//    }
//
//    public List<Game> getRecGame2(GameDTO dto){
//        return repository.findOne(dto.getCasual(),dto.getCollect(),dto.getTech(),dto.getCollabo(),dto.getChallenge(), dto.getStory());
//    }

    public List<Game> findAll() {
        return repository.findAll();
    }

//    public List<Game> findOne(GameDTO dto) {
//        return repository.findOne(dto.getCasual(), dto.getCollect(), dto.getTech(), dto.getCollabo(), dto.getChallenge(), dto.getStory());
//    }

    public List<Game> findOnea(GameDTO dto) {
        return repository.findOnea(dto);
    }

//    public List<Game> getRecGame2(GameDTO dto){
//        return repository.findOne2(dto.getCasual(),dto.getCollect(),dto.getTech(),dto.getCollabo(),dto.getChallenge(), dto.getStory());
//    }
}

package Kuportfolio.playthisgame.Service;

import Kuportfolio.playthisgame.Entity.game;
import Kuportfolio.playthisgame.Repository.gamedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gamedeService {

    @Autowired
    gamedeRepository repository;

    public List<game> getAllgame(){
        return repository.findAll();
    }
    }

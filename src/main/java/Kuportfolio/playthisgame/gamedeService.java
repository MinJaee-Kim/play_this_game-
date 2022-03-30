package Kuportfolio.playthisgame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class gamedeService {

    @Autowired
    gamedeRepository repository;

    public List<gamede> getAllgame(){
        return repository.findAll();
    }
    }

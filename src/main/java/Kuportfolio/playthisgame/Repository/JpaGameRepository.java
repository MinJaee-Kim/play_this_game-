package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.Entity.Game;
import Kuportfolio.playthisgame.dto.GameDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class JpaGameRepository implements GameRepository{
    private final EntityManager entityManager;

    public JpaGameRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Game> findAll() {
        return entityManager.createQuery("select g from Game g", Game.class)
                .getResultList();
    }

    @Override
    public List<Game> findOnea(GameDTO dto) {
        System.out.println(dto.getCasual());
        return entityManager.createQuery("select g from Game g where g.casual = : casual", Game.class)
                .setParameter("casual", dto.getCasual())
                .getResultList();
    }

    @Override
    public List<Game> findTwo(GameDTO dto) {
        System.out.println(dto.getCasual());
        return entityManager.createQuery("select g from Game g where g.casual = : casual", Game.class)
                .setParameter("casual", dto.getCasual())
                .getResultList();
    }
}

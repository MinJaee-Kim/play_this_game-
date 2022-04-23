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
    public List<Game> findOne(long id) {
        return entityManager.createQuery("select g from Game g where g.id = :id", Game.class)
                .setParameter("id", id)
                .getResultList();
    }

    public List CountAll() {
        return entityManager.createQuery("select g.id from Game g")
                .getResultList();
    }

    public List CountBetween(GameDTO dto) {
        return entityManager.createQuery("select g.id from Game g where g.casual between : casual and (: casual + 1) and g.challenge between :challenge and (: challenge +1)" +
                        "and g.collabo between :collabo and (: collabo +1) and g.collect between :collect and (: collect +1) and g.story between :story and (: story +1)" +
                        "and g.tech between :tech and (: tech +1)")
                .setParameter("casual", dto.getCasual())
                .setParameter("challenge", dto.getChallenge())
                .setParameter("collabo", dto.getCollabo())
                .setParameter("collect", dto.getCollect())
                .setParameter("story", dto.getStory())
                .setParameter("tech", dto.getTech())
                .getResultList();
    }

    public List CountBetweenWide(GameDTO dto) {
        return entityManager.createQuery("select g.id from Game g where g.casual between (: casual -1) and (: casual + 1) and g.challenge between (:challenge -1) and (: challenge +1)" +
                        "and g.collabo between (:collabo -1) and (: collabo +1) and g.collect between (:collect -1) and (: collect +1) and g.story between (:story-1) and (: story +1)" +
                        "and g.tech between (:tech-1) and (: tech +1)")
                .setParameter("casual", dto.getCasual())
                .setParameter("challenge", dto.getChallenge())
                .setParameter("collabo", dto.getCollabo())
                .setParameter("collect", dto.getCollect())
                .setParameter("story", dto.getStory())
                .setParameter("tech", dto.getTech())
                .getResultList();
    }

    public List CountBetweenWide2(GameDTO dto) {
        return entityManager.createQuery("select g.id from Game g where g.casual between (: casual -1) and (: casual + 2) and g.challenge between (:challenge -1) and (: challenge + 2)" +
                        "and g.collabo between (:collabo -1) and (: collabo + 2) and g.collect between (:collect -1) and (: collect + 2) and g.story between (:story-1) and (: story + 2)" +
                        "and g.tech between (:tech-1) and (: tech + 2)")
                .setParameter("casual", dto.getCasual())
                .setParameter("challenge", dto.getChallenge())
                .setParameter("collabo", dto.getCollabo())
                .setParameter("collect", dto.getCollect())
                .setParameter("story", dto.getStory())
                .setParameter("tech", dto.getTech())
                .getResultList();
    }



//    public List<Game> findBetweenWide2(GameDTO dto) {
//        return entityManager.createQuery("select g from Game g where g.casual between (: casual -1) and (: casual + 2) and g.challenge between (:challenge -1) and (: challenge + 2)" +
//                        "and g.collabo between (:collabo -1) and (: collabo + 2) and g.collect between (:collect -1) and (: collect + 2) and g.story between (:story-1) and (: story + 2)" +
//                        "and g.tech between (:tech-1) and (: tech + 2)", Game.class)
//                .setParameter("casual", dto.getCasual())
//                .setParameter("challenge", dto.getChallenge())
//                .setParameter("collabo", dto.getCollabo())
//                .setParameter("collect", dto.getCollect())
//                .setParameter("story", dto.getStory())
//                .setParameter("tech", dto.getTech())
//                .getResultList();
//    }

}

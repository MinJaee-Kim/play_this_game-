package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.gamede;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements GamedeRepository{

    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public gamede save(gamede member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<gamede> findById(Long id) {
        gamede gamede = em.find(gamede.class,id);
        return  Optional.ofNullable(gamede);
    }

    @Override
    public Optional<gamede> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<gamede> findAll() {
        return em.createQuery("select m from gamede m",gamede.class)
                .getResultList();
    }
}

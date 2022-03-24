package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.gamede;

import java.util.*;

public class GamedememoryRepository implements GamedeRepository{

    private static Map<Long,gamede> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public gamede save(gamede member) {
        member.setId(++sequence);
        store.put(member.getId(),member);
        return null;
    }

    @Override
    public Optional<gamede> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<gamede> findByName(String name) {
        return store.values().stream()
                .filter(gamede -> gamede.getName().equals(name))
                .findAny();
    }

    @Override
    public List<gamede> findAll() {
        return new ArrayList<>(store.values());
    }
}

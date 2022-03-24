package Kuportfolio.playthisgame.Repository;

import Kuportfolio.playthisgame.gamede;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SDJPApaRepository extends JpaRepository<gamede,Long>, GamedeRepository {

    @Override
    Optional<gamede> findByName(String name);
}

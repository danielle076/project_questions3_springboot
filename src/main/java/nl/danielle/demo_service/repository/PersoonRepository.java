package nl.danielle.demo_service.repository;

import nl.danielle.demo_service.model.Persoon;
import org.springframework.data.repository.CrudRepository;

public interface PersoonRepository extends CrudRepository<Persoon, Long> {

    Iterable<Persoon> findByAchternaam(String lastname);
}

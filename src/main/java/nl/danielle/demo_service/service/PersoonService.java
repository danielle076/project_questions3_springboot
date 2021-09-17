package nl.danielle.demo_service.service;

import nl.danielle.demo_service.model.Persoon;

public interface PersoonService {

    Iterable<Persoon> findAll();
    public Persoon findById(long nr);
    void save(Persoon persoon);
    void deleteById(long nr);
    Iterable<Persoon> findByLastname(String lastname);
    public abstract void updatePersoon(long id, Persoon person);
}

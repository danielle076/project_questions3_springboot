package nl.danielle.demo_service.controller;

import nl.danielle.demo_service.model.Persoon;
import nl.danielle.demo_service.service.PersoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersoonController {

    @Autowired
    private PersoonService persoonService;

    @GetMapping(value = "/personen")
    public ResponseEntity getPersonen(@RequestParam("achternaam") String achternaam) {
        Iterable<Persoon> personen;
        if (achternaam.isEmpty()) {
            personen = persoonService.findAll();
        }
        else {
            personen = persoonService.findByLastname(achternaam);
        }
        return ResponseEntity.ok(personen);
    }

    @GetMapping(value = "/personen/{nr}")
    public ResponseEntity getPersoon(@PathVariable long nr) {
        Persoon persoon = persoonService.findById(nr);
        return ResponseEntity.ok(persoon);
    }

    @PostMapping(value = "/personen")
    public ResponseEntity addPersoon(@RequestBody Persoon persoon) {
        persoonService.save(persoon);
        return ResponseEntity.ok("Toegevoegd");
    }

    @DeleteMapping(value = "/personen/{nr}")
    public ResponseEntity deletePersoon(@PathVariable long nr) {
        persoonService.deleteById(nr);
        return ResponseEntity.ok("Verwijderd");
    }

    @PutMapping(value = "/personen/{nr}")
    public ResponseEntity updatePersoon(@PathVariable long nr, @RequestBody Persoon persoon) {
        return ResponseEntity.ok("Aangepast");
    }
}

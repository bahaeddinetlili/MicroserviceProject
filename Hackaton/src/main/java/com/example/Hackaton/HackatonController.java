package com.example.Hackaton;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hackatons")
public class HackatonController {

    private final HackatonService hackatonService;

    @Autowired
    public HackatonController(HackatonService hackatonService) {
        this.hackatonService = hackatonService;
    }

    @GetMapping
    public List<Hackaton> getAllHackatons() {
        return hackatonService.getAllHackatons();
    }

    @GetMapping("/{id}")
    public Hackaton getHackatonById(@PathVariable int id) {
        return hackatonService.getHackatonById(id);
    }

    @PostMapping
    public Hackaton createHackaton(@RequestBody Hackaton hackaton) {
        return hackatonService.createHackaton(hackaton);
    }

    @PutMapping("/{id}")
    public Hackaton updateHackaton(@PathVariable int id, @RequestBody Hackaton hackaton) {
        return hackatonService.updateHackaton(id, hackaton);
    }

    @DeleteMapping("/{id}")
    public void deleteHackaton(@PathVariable int id) {
        hackatonService.deleteHackaton(id);
    }
}


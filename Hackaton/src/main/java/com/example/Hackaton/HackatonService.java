package com.example.Hackaton;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HackatonService {
    private final HackatonRepository hackatonRepository;

    @Autowired
    public HackatonService(HackatonRepository hackatonRepository) {
        this.hackatonRepository = hackatonRepository;
    }

    public List<Hackaton> getAllHackatons() {
        return hackatonRepository.findAll();
    }

    public Hackaton getHackatonById(Integer id) {
        Optional<Hackaton> optionalHackaton = hackatonRepository.findById(id);
        return optionalHackaton.orElse(null);
    }

    public Hackaton createHackaton(Hackaton hackaton) {
        return hackatonRepository.save(hackaton);
    }

    public Hackaton updateHackaton(Integer id, Hackaton hackaton) {
        if (hackatonRepository.existsById(id)) {
            hackaton.setIdHackaton(id);
            return hackatonRepository.save(hackaton);
        }
        return null;
    }

    public void deleteHackaton(Integer id) {
        hackatonRepository.deleteById(id);
    }
}


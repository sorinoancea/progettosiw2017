package it.uniroma3.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.spring.model.Ruolo;
import it.uniroma3.spring.repository.RuoloRepository;

@Service
public class RuoloService {

    @Autowired
    private RuoloRepository ruoloRepository; 
    
    @Transactional
    public void add(final Ruolo ruolo) {
        this.ruoloRepository.save(ruolo);
    }

}
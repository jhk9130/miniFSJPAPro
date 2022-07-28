package com.personal.jpapractice.controller;

import com.personal.jpapractice.exception.ResourceNotFoundException;
import com.personal.jpapractice.model.Climber;
import com.personal.jpapractice.repository.ClimberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ClimberController {
    @Autowired
    private ClimberRepository climberRepository;

    @GetMapping("/climbers")
    public List<Climber> getAllClimber() {
        return climberRepository.findAll();
    }

    // create climber REST API
    @PostMapping("/climbers")
    public Climber createClimber(@RequestBody Climber climber) {
        return climberRepository.save(climber);
    }

    // get climber by id REST API
    @GetMapping("/climbers/{id}")
    public ResponseEntity<Climber> getClimberById(@PathVariable long id) {
        Climber climber = climberRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Climber not exist with id: " + id));
        return ResponseEntity.ok(climber);
    }

    // update climber REST API
    @PutMapping("/climber/{id}")
    public ResponseEntity<Climber> updateClimber(@PathVariable Long id, @RequestBody Climber climberDetails) {
        Climber climber = climberRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Climber not exist with id: " + id));
        climber.setFname(climberDetails.getFname());
        climber.setLname(climberDetails.getLname());
        climber.setHarness(climberDetails.getHarness());
        climber.setRope(climberDetails.getRope());
        climber.setBelayDevice(climberDetails.getBelayDevice());
        climber.setClimbingShoes(climberDetails.getClimbingShoes());
        climber.setHelmet(climberDetails.getHelmet());
        climber.setChalkBag(climberDetails.getChalkBag());
        climber.setQuickDraws(climberDetails.getQuickDraws());
        climber.setRetailPrice(climberDetails.getRetailPrice());
        climber.setQuantity(climberDetails.getQuantity());

        Climber updatedClimber = climberRepository.save(climber);
        return ResponseEntity.ok(updatedClimber);
    }

    //delete climber REST API
    @DeleteMapping("/climbers/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteClimber(@PathVariable Long id) {
        Climber climber = climberRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Climber not exist with id: " + id));
        climberRepository.delete(climber);
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}

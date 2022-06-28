package com.cohort15adv.muzick.controllers;

import com.cohort15adv.muzick.models.Listener;
import com.cohort15adv.muzick.repositories.ListenerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/listeners")
public class ListenerController {

    @Autowired
    private ListenerRespository listenerRepository;

    @GetMapping("/test")
    public ResponseEntity<?> testRoute() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    // create, read, update, delete

    @PostMapping("/")
    public ResponseEntity<?> createListener(@RequestBody Listener newListener) {
        Listener listener = listenerRepository.save();
        return new ResponseEntity<>(listener, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllListeners() {
        List<Listener> listener = listenerRepository.findAll();
        return new ResponseEntity<>(listener, HttpStatus.OK);
    }

    @GetMapping("/{ListenerId}/{noteID}")
    public ResponseEntity<?> getOneLinstener(@PathVariable, Long id) {
        listenerRepository.findById(id).orElseThrow(new Repon);
    }
}

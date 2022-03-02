package com.example.ukesoppgave1motorvogn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {
    private final List<Motorvogn> alleMotorvogner = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreMotorvogn(Motorvogn innMotorvogn){
        alleMotorvogner.add(innMotorvogn);
    }
    @GetMapping("/hentAlle")
        public List<Motorvogn> hentAlle(){
            return alleMotorvogner;
        }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleMotorvogner.clear();
    }
    }


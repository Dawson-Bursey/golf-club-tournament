package com.keyin.golfclub.controller;

import com.keyin.golfclub.model.Tournament;
import com.keyin.golfclub.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);
    }

    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/{id}")
    public Optional<Tournament> getTournamentById(@PathVariable Long id) {
        return tournamentService.getTournamentById(id);
    }

//    @PostMapping("/{tournamentId}/addMember/{memberId}")
//    public Tournament addMemberToTournament(
//            @PathVariable Long tournamentId,
//            @PathVariable Long memberId) {
//        return tournamentService.addMemberToTournament(tournamentId, memberId);
//    }
}

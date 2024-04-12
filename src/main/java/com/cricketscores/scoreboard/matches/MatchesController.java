package com.cricketscores.scoreboard.matches;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class MatchesController {

    @Autowired
    private MatchesRepository matchesRepository;

    @GetMapping("/matches")
    @ResponseBody
    public Iterable<Match> getMatches() {
        return matchesRepository.findAll();
    }

    @PostMapping("/matches")
    public Match setMatches(@RequestBody MatchDTO matchResult) throws Exception {
        Match match = new Match();

        String matchNumber = matchResult.getMatchNumber();
        var matchResults =  matchesRepository.findByMatchNumber(matchNumber);

        if (matchResults != null && matchResults.getMatchNumber().equals(matchNumber)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Match Already Exists");
        }

        match.setMatchNumber(matchResult.getMatchNumber());
        match.setTitle(matchResult.getTitle());
        match.setTiming(matchResult.getTiming());
        match.setVenue(matchResult.getVenue());
        match.setCaptainHome(matchResult.getCaptainHome());
        match.setCaptainAway(matchResult.getCaptainAway());
        match.setHomeTeam(matchResult.getHomeTeam());
        match.setAwayTeam(matchResult.getAwayTeam());
        match.setUmpires(matchResult.getUmpires());

        matchesRepository.save(match);

        return matchesRepository.findByMatchNumber(matchNumber);
    }

    @PatchMapping("/matches/{id}")
    public Match updateMatches( @PathVariable  String id,  @RequestBody MatchDTO matchResult) throws Exception {
        var matchResults =  matchesRepository.findByMatchNumber(id);

        if (matchResults == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Match is not exist.");
        }

        matchResults.setFinalDescription(matchResult.getFinalDescription());
        matchResults.setHomeTeamScore(matchResult.getHomeTeamScore());
        matchResults.setHomeTeamWickets(matchResult.getHomeTeamWickets());
        matchResults.setHomeTeamOverPlayed(matchResult.getHomeTeamOverPlayed());

        matchResults.setAwayTeamScore(matchResult.getAwayTeamScore());
        matchResults.setAwayTeamWickets(matchResult.getAwayTeamWickets());
        matchResults.setAwayTeamOverPlayed(matchResult.getAwayTeamOverPlayed());

        matchResults.setWicketsWin(matchResult.getWicketsWin());
        matchResults.setWinBy(matchResult.getWinBy());

        matchResults.setWinner(matchResult.getWinner());
        matchResults.setManOfMatch(matchResult.getManOfMatch());

        matchesRepository.save(matchResults);

        var result = matchesRepository.findById(matchResults.getId());

        return result.orElseThrow();
    }


    @DeleteMapping("/matches/{matchId}")
    public String deleteMatches( @PathVariable  String matchId) throws Exception {

        var matchResults =  matchesRepository.findByMatchNumber(matchId);
        if (matchResults == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Match Id does not Exists");
        }

        matchesRepository.deleteMatchNumber(matchId);

        return "Item Deleted";
    }

}


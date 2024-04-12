package com.cricketscores.scoreboard.matches;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchesRepository extends CrudRepository<Match, Integer> {

    @Query(value = "SELECT * FROM Matches u WHERE u.match_number = ?1", nativeQuery = true)
    Match findByMatchNumber(String matchNumber);


    @Query(value = "DELETE FROM Matches u WHERE u.match_number = ?1", nativeQuery = true)
    void deleteMatchNumber(String matchNumber);
}

package com.cricketscores.scoreboard.matches;

import jakarta.persistence.*;

public class MatchDTO {
    private String matchNumber;
    private String manOfMatch;
    private String title;
    private String timing;

    @Embedded
    private Venue venue;

    private String audienceAttendance;

    private String homeTeam;

    private String awayTeam;
    private String winner;

    private String captainHome;


    private String captainAway;

    @Embedded
    private Toss toss;

    @Embedded
    private Umpires umpires;

    private String finalDescription;

    private String homeTeamScore;
    private String homeTeamWickets;
    private String homeTeamOverPlayed;
    private String awayTeamScore;
    private String awayTeamWickets;
    private String awayTeamOverPlayed;
    private Boolean wicketsWin;
    private String winBy;

    public String getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(String matchNumber) {
        this.matchNumber = matchNumber;
    }

    public String getManOfMatch() {
        return manOfMatch;
    }

    public void setManOfMatch(String manOfMatch) {
        this.manOfMatch = manOfMatch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public String getAudienceAttendance() {
        return audienceAttendance;
    }

    public void setAudienceAttendance(String audienceAttendance) {
        this.audienceAttendance = audienceAttendance;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getCaptainHome() {
        return captainHome;
    }

    public void setCaptainHome(String captainHome) {
        this.captainHome = captainHome;
    }

    public String getCaptainAway() {
        return captainAway;
    }

    public void setCaptainAway(String captainAway) {
        this.captainAway = captainAway;
    }

    public Toss getToss() {
        return toss;
    }

    public void setToss(Toss toss) {
        this.toss = toss;
    }

    public Umpires getUmpires() {
        return umpires;
    }

    public void setUmpires(Umpires umpires) {
        this.umpires = umpires;
    }

    public String getFinalDescription() {
        return finalDescription;
    }

    public void setFinalDescription(String finalDescription) {
        this.finalDescription = finalDescription;
    }

    public String getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(String homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public String getHomeTeamWickets() {
        return homeTeamWickets;
    }

    public void setHomeTeamWickets(String homeTeamWickets) {
        this.homeTeamWickets = homeTeamWickets;
    }

    public String getHomeTeamOverPlayed() {
        return homeTeamOverPlayed;
    }

    public void setHomeTeamOverPlayed(String homeTeamOverPlayed) {
        this.homeTeamOverPlayed = homeTeamOverPlayed;
    }

    public String getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(String awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public String getAwayTeamWickets() {
        return awayTeamWickets;
    }

    public void setAwayTeamWickets(String awayTeamWickets) {
        this.awayTeamWickets = awayTeamWickets;
    }

    public String getAwayTeamOverPlayed() {
        return awayTeamOverPlayed;
    }

    public void setAwayTeamOverPlayed(String awayTeamOverPlayed) {
        this.awayTeamOverPlayed = awayTeamOverPlayed;
    }

    public Boolean getWicketsWin() {
        return wicketsWin;
    }

    public void setWicketsWin(Boolean wicketsWin) {
        this.wicketsWin = wicketsWin;
    }

    public String getWinBy() {
        return winBy;
    }

    public void setWinBy(String winBy) {
        this.winBy = winBy;
    }
}

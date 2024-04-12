package com.cricketscores.scoreboard.matches;

import jakarta.persistence.*;

@Embeddable
class Venue {
    private String city;
    private String state;
    @Column(name = "stadium_name")
    private String stadiumName;

    public Venue() {}

    public Venue(String city, String state, String stadiumName) {
        this.city = city;
        this.state = state;
        this.stadiumName = stadiumName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStadiumName() {
        return stadiumName;
    }
}

@Embeddable
class Toss {
    @Column(name = "toss_call")
    private String tossCall;
    @Column(name = "toss_winner")
    private String tossWinner;

    public Toss() {}

    public Toss (String tossCall, String tossWinner) {
        this.tossCall = tossCall;
        this.tossWinner = tossWinner;
    }

    public String getTossCall() {
        return tossCall;
    }

    public String getTossWinner() {
        return tossWinner;
    }
}

@Embeddable
class Umpires {
    @Column(name = "first_umpire")
    private String firstUmpire;
    @Column(name = "second_umpire")
    private String secondUmpire;

    @Column(name = "third_umpire")
    private String thirdUmpire;

    public Umpires() {}

    public Umpires(String firstUmpire, String secondUmpire, String thirdUmpire) {
        this.firstUmpire = firstUmpire;
        this.secondUmpire = secondUmpire;
        this.thirdUmpire = thirdUmpire;
    }

    public String getFirstUmpire() {
        return firstUmpire;
    }

    public String getSecondUmpire() {
        return secondUmpire;
    }

    public String getThirdUmpire() {
        return thirdUmpire;
    }
}

@Entity(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "match_number")
    private String matchNumber;
    private String slug;
    @Column(name = "man_of_match")
    private String manOfMatch;
    private String title;
    private String timing;

    @Embedded
    private Venue venue;

    @Column(name = "audience_attendance")
    private String audienceAttendance;

    @Column(name = "home_team")
    private String homeTeam;
    @Column(name = "away_team")
    private String awayTeam;
    private String winner;

    @Column(name = "captain_home")
    private String captainHome;

    @Column(name = "captain_away")
    private String captainAway;

    @Embedded
    private Toss toss;

    @Embedded
    private Umpires umpires;

    @Column(name = "final_description")
    private String finalDescription;

    @Column(name = "home_team_score")
    private String homeTeamScore;
    @Column(name = "home_team_wickets")
    private String homeTeamWickets;
    @Column(name = "home_team_over_played")
    private String homeTeamOverPlayed;
    @Column(name = "away_team_score")
    private String awayTeamScore;
    @Column(name = "away_team_wickets")
    private String awayTeamWickets;
    @Column(name = "away_team_over_played")
    private String awayTeamOverPlayed;

    @Column(name = "wickets_win")
    private Boolean wicketsWin;
    @Column(name = "win_by")
    private String winBy;

    public Match() {}

    public Match(String matchNumber, String title, String timing, Venue venue, String homeTeam, String awayTeam, String captain_home, String captain_away, Toss toss, Umpires umpires ) {
        this.matchNumber = matchNumber;
        this.title = title;
        this.timing = timing;
        this.venue = venue;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.captainHome = captain_home;
        this.captainAway = captain_away;
        this.toss = toss;
        this.umpires = umpires;
    }


    public Integer getId() {
        return id;
    }

    public void setManOfMatch(String manOfMatch) {
        this.manOfMatch = manOfMatch;
    }

    public void setAudienceAttendance(String audienceAttendance) {
        this.audienceAttendance = audienceAttendance;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void setCaptainHome(String captain_home) {
        this.captainHome = captain_home;
    }

    public void setCaptainAway(String captain_away) {
        this.captainAway = captain_away;
    }

    public void setFinalDescription(String finalDescription) {
        this.finalDescription = finalDescription;
    }


    public String getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(String matchNumber) {
        this.matchNumber = matchNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setToss(Toss toss) {
        this.toss = toss;
    }

    public void setUmpires(Umpires umpires) {
        this.umpires = umpires;
    }

    public String getSlug() {
        return slug;
    }

    public String getManOfMatch() {
        return manOfMatch;
    }

    public String getTitle() {
        return title;
    }

    public String getTiming() {
        return timing;
    }

    public Venue getVenue() {
        return venue;
    }

    public String getAudienceAttendance() {
        return audienceAttendance;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getWinner() {
        return winner;
    }

    public String getCaptainHome() {
        return captainHome;
    }

    public String getCaptainAway() {
        return captainAway;
    }

    public Toss getToss() {
        return toss;
    }

    public Umpires getUmpires() {
        return umpires;
    }

    public String getFinalDescription() {
        return finalDescription;
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

    @Override
    public String toString() {
        return "Match{" +
                "matchNumber='" + matchNumber + '\'' +
                ", slug='" + slug + '\'' +
                ", manOfMatch='" + manOfMatch + '\'' +
                ", title='" + title + '\'' +
                ", timing='" + timing + '\'' +
                ", venue=" + venue +
                ", audienceAttendance='" + audienceAttendance + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", winner='" + winner + '\'' +
                ", captain_home='" + captainHome + '\'' +
                ", captain_away='" + captainAway + '\'' +
                ", toss=" + toss +
                ", umpires=" + umpires +
                ", finalDescription='" + finalDescription + '\'' +
                '}';
    }
}

package com.example.Newtask.model;

import java.util.Date;

//model class(table_name)
public class Match {

	// entities
	int matchId;
	int team1Id;
	int team2Id;
	Date date;
	String venue;
	String result;

	public Match() {
	}

	public Match(int matchId, int team1Id, int team2Id, Date date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.team1Id = team1Id;
		this.team2Id = team2Id;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", team1Id=" + team1Id + ", team2Id=" + team2Id + ", date=" + date
				+ ", venue=" + venue + ", result=" + result + "]";
	}

	/**
	 * @return the matchId
	 */
	public int getMatchId() {
		return matchId;
	}

	/**
	 * @param matchId the matchId to set
	 */
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	/**
	 * @return the team1Id
	 */
	public int getTeam1Id() {
		return team1Id;
	}

	/**
	 * @param team1Id the team1Id to set
	 */
	public void setTeam1Id(int team1Id) {
		this.team1Id = team1Id;
	}

	/**
	 * @return the team2Id
	 */
	public int getTeam2Id() {
		return team2Id;
	}

	/**
	 * @param team2Id the team2Id to set
	 */
	public void setTeam2Id(int team2Id) {
		this.team2Id = team2Id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the venue
	 */
	public String getVenue() {
		return venue;
	}

	/**
	 * @param venue the venue to set
	 */
	public void setVenue(String venue) {
		this.venue = venue;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

}

package com.example.Newtask.model;

public class Team {

	int teamId;
	String teamName;
	String teamcity;
	String teamCoach;

	public Team() {
	}

	public Team(int teamId, String teamName, String teamcity, String teamCoach) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamcity = teamcity;
		this.teamCoach = teamCoach;
	}

	/**
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the teamcity
	 */
	public String getTeamcity() {
		return teamcity;
	}

	/**
	 * @param teamcity the teamcity to set
	 */
	public void setTeamcity(String teamcity) {
		this.teamcity = teamcity;
	}

	/**
	 * @return the teamCoach
	 */
	public String getTeamCoach() {
		return teamCoach;
	}

	/**
	 * @param teamCoach the teamCoach to set
	 */
	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}

}

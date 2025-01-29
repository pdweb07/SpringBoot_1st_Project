package com.example.Newtask.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Newtask.model.Team;

@Repository
public class TeamDao {

	ArrayList<Team> listOfTeam = new ArrayList<Team>();

	public TeamDao() {
		listOfTeam.add(new Team(101, "team1", "Pune", "PuneCoach"));
		listOfTeam.add(new Team(102, "team2", "Mumbai", "MumbaiCoach"));
		listOfTeam.add(new Team(103, "team3", "Banglore", "BangCoach"));
		listOfTeam.add(new Team(104, "team4", "Maharashtra", "MhCoach"));
		listOfTeam.add(new Team(105, "team5", "MP", "MpCoach"));
	}

	// posting method or adding/inserting data
	public String addteam(Team team) {
		listOfTeam.add(team);

		return "Response Added Successfully";
	}

	// get all team data
	public List<Team> getAllTeams() {
		return listOfTeam;
	}

	// getting specific data by selecting ID
	public Team getTeamById(int teamId) {
		for (Team team : listOfTeam) {
			if (team.getTeamId() == teamId) {
				return team;
			}
		}
		return null;
	}

	// delete
	public String deleteTeamById(int teamId) {
		String msg = null;
		for (Team team : listOfTeam) {
			if (team.getTeamId() == teamId) {
				listOfTeam.remove(team);
				msg = "TeamData Deleted Successfully!";
				return msg;
			}
		}
		msg = "team not found";
		return msg;
	}

	// update
	public String updateTeam(int teamId, Team team) {
		String msg = deleteTeamById(teamId);
		if (msg.equals("TeamData Deleted Successfully!")) {
			listOfTeam.add(team);
			return "Team updated";
		} else {
			return "not update";
		}
	}

}

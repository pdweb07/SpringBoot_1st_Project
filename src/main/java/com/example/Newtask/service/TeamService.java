package com.example.Newtask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Newtask.dao.TeamDao;
import com.example.Newtask.model.Team;

@Service
public class TeamService {

	@Autowired
	TeamDao teamDao;

	// getting all data
	public List<Team> getAllTeams() {
		return teamDao.getAllTeams(); // Fetch all teams from TeamDao
	}

	// getting data by selecting id
	public Team getTeamById(int teamId) {
		return teamDao.getTeamById(teamId); // Fetch team by ID
	}

	// Adding the data using post in request body
	public String addTeam(Team team) {
		String msg = teamDao.addteam(team);

		return msg;
	}

	// delete
	public String deleteTeam(int teamId) {
		return teamDao.deleteTeamById(teamId);
	}

	// update team
	public String updateTeam(int teamId, Team team) {
		String msg = teamDao.updateTeam(teamId, team);
		if (msg.equals("Team updated")) {
			return "Team updated";
		} else {
			return "Team not found to update";
		}
	}

}

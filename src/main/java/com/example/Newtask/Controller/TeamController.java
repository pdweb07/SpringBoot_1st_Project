package com.example.Newtask.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Newtask.dao.TeamDao;
import com.example.Newtask.model.Team;
import com.example.Newtask.service.TeamService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class TeamController {

	@Autowired
	TeamService teamService;

	@PostMapping("/api/teams")
	public String addTeam(@RequestBody Team team) {
//		System.out.println(team);

		String msg = teamService.addTeam(team);
		return msg;
	}

	// getting all team data
	@GetMapping("/api/team")
	public List<Team> getAllTeams() {
		return teamService.getAllTeams(); // Fetch all teams
	}

	// selecting by its id
	@GetMapping("/api/teamss")
	public Object getTeamById(@RequestParam("teamId") int teamId) {

		Team team = teamService.getTeamById(teamId);

		if (team != null) {

			return team;

		} else {
			return "Invalid Data Entered";
		}
	}

	@DeleteMapping("/api/deleteTeam/{teamId}")
	public String deleteTeam(@PathVariable int teamId) {
		return teamService.deleteTeam(teamId);
	}
	@PutMapping("/api/teamUpdate/{teamId}")
	public String updateTeam(@RequestBody Team team,@PathVariable int teamId) {
		String msg = teamService.updateTeam(teamId, team);
		return msg;
	}
}

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

import com.example.Newtask.dao.MatchDao;
import com.example.Newtask.model.Match;
import com.example.Newtask.service.MatchService;
import com.example.Newtask.service.TeamService;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class MatchController {

	@Autowired
	MatchService matchService;

	@PostMapping("/api/Matchs")
	public String addMatch(@RequestBody Match match) {
//		System.out.println(Match);

		String msg = matchService.addMatch(match);
		return msg;
	}

	// getting all Match data
	@GetMapping("/api/Match")
	public List<Match> getAllMatchs() {
		return matchService.getAllMatchs(); // Fetch all Matchs
	}

	// selecting by its id
	@GetMapping("/api/Matchss")
	public Object getMatchById(@RequestParam("MatchId") int MatchId) {

		Match Match = matchService.getMatchById(MatchId);

		if (Match != null) {

			return Match;

		} else {
			return "Invalid Data Entered";
		}
	}

	@DeleteMapping("/api/deleteMatch/{MatchId}")
	public String deleteMatch(@PathVariable int MatchId) {
		return matchService.deleteMatch(MatchId);
	}

	@PutMapping("/api/MatchUpdate/{MatchId}")
	public String updateMatch(@RequestBody Match Match, @PathVariable int MatchId) {
		String msg = matchService.updateMatch(MatchId, Match);
		return msg;
	}
}

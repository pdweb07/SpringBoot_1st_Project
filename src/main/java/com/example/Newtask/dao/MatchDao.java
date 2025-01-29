package com.example.Newtask.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Newtask.model.Match;

@Repository
public class MatchDao {

	ArrayList<Match> listOfMatch = new ArrayList<Match>();

	public MatchDao() {
		listOfMatch.add(new Match(10, 20, 30, new Date(), "India", "Winner"));
		listOfMatch.add(new Match(40, 50, 60, new Date(), "England", "Loser"));
		listOfMatch.add(new Match(70, 80, 90, new Date(), "Holland", "Winner"));
		listOfMatch.add(new Match(30, 70, 34, new Date(), "America", "Loser"));
	}

	// posting method or adding/inserting data
	public String addMatch(Match Match) {
		listOfMatch.add(Match);

		return "Response Added Successfully";
	}

	// get all Match data
	public List<Match> getAllMatchs() {
		return listOfMatch;
	}

	// getting specific data by selecting ID
	public Match getMatchById(int MatchId) {
		for (Match Match : listOfMatch) {
			if (Match.getMatchId() == MatchId) {
				return Match;
			}
		}
		return null;
	}

	// delete
	public String deleteMatchById(int MatchId) {
		String msg = null;
		for (Match Match : listOfMatch) {
			if (Match.getMatchId() == MatchId) {
				listOfMatch.remove(Match);
				msg = "MatchData Deleted Successfully!";
				return msg;
			}
		}
		msg = "Match not found";
		return msg;
	}

	// update
	public String updateMatch(int MatchId, Match Match) {
		String msg = deleteMatchById(MatchId);
		if (msg.equals("MatchData Deleted Successfully!")) {
			listOfMatch.add(Match);
			return "Match updated";
		} else {
			return "not update";
		}
	}

}

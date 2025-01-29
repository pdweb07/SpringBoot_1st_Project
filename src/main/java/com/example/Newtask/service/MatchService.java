package com.example.Newtask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Newtask.dao.MatchDao;
import com.example.Newtask.model.Match;

@Service
public class MatchService {

	@Autowired
	MatchDao matchDao;

	public String addMatch(Match match) {
		String msg = matchDao.addMatch(match);

		return msg;
	}

	// getting all data
	public List<Match> getAllMatchs() {
		return matchDao.getAllMatchs(); // Fetch all Matchs from MatchDao
	}

	// getting data by selecting id
	public Match getMatchById(int MatchId) {
		return matchDao.getMatchById(MatchId); // Fetch Match by ID
	}
	
	//delete
	public String deleteMatch(int MatchId)
	{
		return matchDao.deleteMatchById(MatchId);
	}
	
	//update Match
	public String updateMatch(int MatchId,Match Match) {
		String msg = matchDao.updateMatch(MatchId, Match);
		if(msg.equals("Match updated")) {
			return "Match updated";
		}else {
			return "Match not found to update";
		}
	}

}

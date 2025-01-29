package com.example.Newtask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Newtask.dao.PlayerDao;
import com.example.Newtask.model.Player;

@Service
public class PlayerService {

	@Autowired
	PlayerDao playerDao;

	public String addplayer(Player player) {
		String msg = playerDao.addPlayer(player);

		return msg;
	}

	// getting all data
	public List<Player> getAllplayers() {
		return playerDao.getAllPlayers(); // Fetch all players from playerDao
	}

	// getting data by selecting id
	public Player getplayerById(int playerId) {
		return playerDao.getPlayerById(playerId); // Fetch player by ID
	}
	
	//delete
	public String deleteplayer(int playerId)
	{
		return playerDao.deletePlayerById(playerId);
	}
	
	//update player
	public String updateplayer(int playerId,Player player) {
		String msg = playerDao.updatePlayer(playerId, player);
		if(msg.equals("player updated")) {
			return "player updated";
		}else {
			return "player not found to update";
		}
	}

}

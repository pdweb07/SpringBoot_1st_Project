package com.example.Newtask.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Newtask.model.Player;

@Repository
public class PlayerDao {

	ArrayList<Player> listOfPlayer = new ArrayList<Player>();

	public PlayerDao() {
		listOfPlayer.add(new Player(101, "Player1", 1, "PuneCoach"));
		listOfPlayer.add(new Player(102, "Player2", 2, "MumbaiCoach"));
		listOfPlayer.add(new Player(103, "Player3", 3, "BangCoach"));
		listOfPlayer.add(new Player(104, "Player4", 4, "MhCoach"));
		listOfPlayer.add(new Player(105, "Player5", 5, "MpCoach"));
	}

	// posting method or adding/inserting data
	public String addPlayer(Player Player) {
		listOfPlayer.add(Player);

		return "Response Added Successfully";
	}

	// get all Player data
	public List<Player> getAllPlayers() {
		return listOfPlayer;
	}

	// getting specific data by selecting ID
	public Player getPlayerById(int PlayerId) {
		for (Player Player : listOfPlayer) {
			if (Player.getPlayerId() == PlayerId) {
				return Player;
			}
		}
		return null;
	}

	// delete
	public String deletePlayerById(int PlayerId) {
		String msg = null;
		for (Player Player : listOfPlayer) {
			if (Player.getPlayerId() == PlayerId) {
				listOfPlayer.remove(Player);
				msg = "PlayerData Deleted Successfully!";
				return msg;
			}
		}
		msg = "Player not found";
		return msg;
	}

	// update
	public String updatePlayer(int PlayerId, Player Player) {
		String msg = deletePlayerById(PlayerId);
		if (msg.equals("PlayerData Deleted Successfully!")) {
			listOfPlayer.add(Player);
			return "Player updated";
		} else {
			return "not update";
		}
	}

}

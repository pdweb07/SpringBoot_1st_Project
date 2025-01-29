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

import com.example.Newtask.dao.PlayerDao;
import com.example.Newtask.model.Player;
import com.example.Newtask.service.PlayerService;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class PlayerController {

	@Autowired
	PlayerService playerService;

	@PostMapping("/api/Players")
	public String addPlayer(@RequestBody Player player) {
//		System.out.println(Player);

		String msg = playerService.addplayer(player);
		return msg;
	}

	// getting all Player data
	@GetMapping("/api/Player")
	public List<Player> getAllPlayers() {
		return playerService.getAllplayers(); // Fetch all Players
	}

	// selecting by its id
	@GetMapping("/api/Playerss")
	public Object getPlayerById(@RequestParam("PlayerId") int PlayerId) {

		Player player = playerService.getplayerById(PlayerId);

		if (player != null) {

			return player;

		} else {
			return "Invalid Data Entered";
		}
	}

	@DeleteMapping("/api/deletePlayer/{PlayerId}")
	public String deletePlayer(@PathVariable int PlayerId) {
		return playerService.deleteplayer(PlayerId);
	}

	@PutMapping("/api/PlayerUpdate/{PlayerId}")
	public String updatePlayer(@RequestBody Player player, @PathVariable int PlayerId) {
		String msg = playerService.updateplayer(PlayerId, player);
		return msg;
	}
}

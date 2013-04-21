package com.nhpatt.spock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SpockGame {

	private static HashMap<String, List<String>> rules = new HashMap<>();
	static {
		rules.put("tijeras", Arrays.asList("lagarto", "papel"));
		rules.put("lagarto", Arrays.asList("spock", "papel"));
		rules.put("spock", Arrays.asList("piedra", "tijeras"));
		rules.put("piedra", Arrays.asList("lagarto", "tijeras"));
		rules.put("papel", Arrays.asList("piedra", "spock"));
	}

	public static void main(String[] args) {
		System.out.println(play("tijeras", "piedra"));
	}

	private static String play(String player1, String player2) {
		if (player1.equals(player2)) {
			return "Empate";
		}
		return rules.get(player1).contains(player2) ? "Victoria" : "Derrota";
	}

}

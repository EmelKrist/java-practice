package _7kyu;

import java.util.*;

/*
https://www.codewars.com/kata/57d29ccda56edb4187000052
 */
public class RockPaperScissorsLizardSpock {
    public static String rpsls(String player1, String player2){
        if (player1.equals(player2)) return "Draw!";
        List<String> list = new ArrayList<>(Arrays.asList("rock", "paper", "scissors", "lizard", "spock"));
        boolean player1Won = false;
        switch (player1){
            case "rock":
                if (player2.equals(list.get(2)) || player2.equals(list.get(3))) player1Won = true;
                break;
            case "paper":
                if (player2.equals(list.get(0)) || player2.equals(list.get(4))) player1Won = true;
                break;
            case "scissors":
                if (player2.equals(list.get(1)) || player2.equals(list.get(3))) player1Won = true;
                break;
            case "lizard":
                if (player2.equals(list.get(4)) || player2.equals(list.get(1))) player1Won = true;
                break;
            default: //spock
                if (player2.equals(list.get(0)) || player2.equals(list.get(2))) player1Won = true;
        }

        return player1Won ? "Player 1 Won!" : "Player 2 Won!";
    }

    public static String rpslsAlter(String player1, String player2){
        if (player1.equals(player2)) return "Draw!";
        Map<String, String> map = new HashMap<>();
        map.put("rock", "scissorslizard");
        map.put("paper", "rockspock");
        map.put("scissors", "paperlizard");
        map.put("lizard", "spockpaper");
        map.put("spock", "rockscissors");
        return map.get(player1).contains(player2) ? "Player 1 Won!" : "Player 2 Won!";
    }

}

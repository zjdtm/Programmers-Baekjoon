import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
            Map<String, Integer> playersMap = new HashMap<>();
            for(int i = 0; i < players.length; i++) {
                playersMap.put(players[i], i);
            }

            for(String player : callings) {

                int ownRank = playersMap.get(player);

                String beforePlayer = players[ownRank - 1];

                players[ownRank - 1] = player;
                players[ownRank] = beforePlayer;

                playersMap.put(player, ownRank - 1);
                playersMap.put(beforePlayer, ownRank);

            }

            return players;
    }
}
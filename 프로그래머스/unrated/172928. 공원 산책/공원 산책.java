class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] park_map = new String[park.length][park[0].length()];

        for(int i = 0; i < park_map.length; i++) {
            String[] row = park[i].split("");
            for(int j = 0; j < park_map[i].length; j++) {
                if(row[j].equals("S")) {
                    answer[0] = i;
                    answer[1] = j;
                }
                park_map[i][j] = row[j];
            }
        }

        for(int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            int n = Integer.parseInt(route[1]);
            boolean check = false;
            if(route[0].equals("N") && answer[0] - n >= 0){
                for(int j = 1; j <= n; j++) {
                    if(!park_map[answer[0] - j][answer[1]].equals("X"))
                        check = true;
                    else {
                        check = false;
                        break;
                    }
                }
                if(check)
                    answer[0] -= n;
            }else if(route[0].equals("S") && answer[0] + n < park_map.length){
                for(int j = 1; j <= n; j++) {
                    if(!park_map[answer[0] + j][answer[1]].equals("X"))
                        check = true;
                    else {
                        check = false;
                        break;
                    }
                }
                if(check)
                    answer[0] += n;
            }else if(route[0].equals("E") && answer[1] + n < park_map[0].length){
                for(int j = 1; j <= n; j++) {
                    if(!park_map[answer[0]][answer[1] + j].equals("X"))
                        check = true;
                    else {
                        check = false;
                        break;
                    }
                }
                if(check)
                    answer[1] += n;
            }else if(route[0].equals("W") && answer[1] - n >= 0){
                for(int j = 1; j <= n; j++) {
                    if(!park_map[answer[0]][answer[1] - j].equals("X"))
                        check = true;
                    else {
                        check = false;
                        break;
                    }
                }
                if(check)
                    answer[1] -= n;
            }
        }
        return answer;
    }
}
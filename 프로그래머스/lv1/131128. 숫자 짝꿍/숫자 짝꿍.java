class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x_numbers = new int[10];
        int[] y_numbers = new int[10];

        for(int i = 0; i < X.length(); i++) {
            int x = X.charAt(i) - 48;
            x_numbers[x]++;
        }

        for(int i = 0; i < Y.length(); i++) {
            int y = Y.charAt(i) - 48;
            y_numbers[y]++;
        }

        for(int i = 9; i >= 0; i--) {
            while(x_numbers[i] > 0 && y_numbers[i] > 0) {
                answer.append(i);
                x_numbers[i]--;
                y_numbers[i]--;
            }
        }

        if(answer.toString().equals(""))
            return "-1";
        if(answer.substring(0, 1).equals("0"))
            return "0";

        return answer.toString();
    }
}
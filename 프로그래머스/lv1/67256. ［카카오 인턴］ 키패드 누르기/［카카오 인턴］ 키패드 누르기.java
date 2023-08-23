class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        // * 은 -1 # 은 -2
        int leftHand = 10;
        int rightHand = 12;
        for (int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftHand = number;
            }else if(number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightHand = number;
            }else {
                if(number == 0) number = 11;
                int leftdist = Math.abs(number - leftHand) / 3 + Math.abs(number - leftHand) % 3;
                int rightdist = Math.abs(number - rightHand) / 3 + Math.abs(number - rightHand) % 3;

                if(leftdist < rightdist){
                    answer += "L";
                    leftHand = number;
                }else if(leftdist > rightdist) {
                    answer += "R";
                    rightHand = number;
                }else {
                    if(hand.equals("right")) {
                        answer += "R";
                        rightHand = number;
                    }else {
                        answer += "L";
                        leftHand = number;
                    }
                }
            }
        }

        return answer;
    }
}
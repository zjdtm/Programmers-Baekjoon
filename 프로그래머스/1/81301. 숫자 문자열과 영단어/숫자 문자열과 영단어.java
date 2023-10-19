class Solution {
    public int solution(String s) {
        String[] alphabat = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < alphabat.length; i++) {
                s = s.replace(alphabat[i], Integer.toString(i));
            }

            return Integer.parseInt(s);
    }
}
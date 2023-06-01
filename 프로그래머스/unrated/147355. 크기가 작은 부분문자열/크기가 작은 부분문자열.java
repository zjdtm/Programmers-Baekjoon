class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int start = 0;
        long plen = Long.parseLong(p);
        int end = p.length();

        while(start < t.length() - (p.length() - 1)) {
            String ts = t.substring(start, end);
            long target = Long.parseLong(ts);
            if(target <= plen)
                answer++;
            start++;
            end++;
        }

        return answer;
    }
}
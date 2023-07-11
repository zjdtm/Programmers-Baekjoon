class Solution {
    public int solution(int[][] sizes) {
        int MAX_W = 0;
        int MAX_H = 0;

        for(int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            if(MAX_W < w)
                MAX_W = w;
            if(MAX_H < h)
                MAX_H = h;
        }

        return MAX_W * MAX_H;
    }
}
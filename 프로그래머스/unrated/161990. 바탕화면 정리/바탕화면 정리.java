class Solution {
    public int[] solution(String[] wallpaper) {
            int lux = Integer.MAX_VALUE;
            int luy = Integer.MAX_VALUE;
            int rdx = 0;
            int rdy = 0;

            for(int i = 0; i < wallpaper.length; i++) {
                String wp = wallpaper[i];
                for(int j = 0; j < wallpaper[i].length(); j++) {
                    if (wp.charAt(j) == '#') {
                        lux = Math.min(lux, i);
                        luy = Math.min(luy, j);
                        rdx = Math.max(rdx, i + 1);
                        rdy = Math.max(rdy, j + 1);
                    }
                }
            }
            return new int[]{lux, luy, rdx, rdy};
    }
}
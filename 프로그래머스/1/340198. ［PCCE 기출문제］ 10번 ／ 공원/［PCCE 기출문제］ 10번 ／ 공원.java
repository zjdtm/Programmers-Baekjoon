import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        
        int rows = park.length;
        int cols = park[0].length;
        int answer = -1;
        
        Arrays.sort(mats);
        
        for (int m = mats.length - 1; m >= 0; m--) {
            boolean check = false;
            
            for (int i = 0; i <= rows - mats[m]; i++) {
                for (int j = 0; j <= cols - mats[m]; j++) {
                    boolean isPerson = true;
                    
                    for (int x = i; x < i + mats[m]; x++) {
                        for (int y = j; y < j + mats[m]; y++) {
                            if (!park[x][y].equals("-1")) {
                                isPerson = false;
                                break;
                            }
                        }
                        if (!isPerson) break;
                    }
                    
                    if (isPerson) {
                        check = true;
                        break;
                    }
                }
                
                if (check) break;
            }
            
            if (check) {
                answer = mats[m];
                break;
            }
            
        }
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> resSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for (int r : reserve) {
            resSet.add(r);
        }
        for (int l : lost) {
            if (resSet.contains(l)) {
                resSet.remove(l);
            } else {
                lostSet.add(l);
            }
        }

        for (int r : resSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }

        return n - lostSet.size();
    }
}
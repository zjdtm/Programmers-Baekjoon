import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> infoMap = new HashMap<>();
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();

        for(int i = 0; i < id_list.length; i++) {
            infoMap.put(id_list[i], i);
            reportMap.put(id_list[i], new HashSet<>());
        }

        for(String s : report) {
            String from = s.split(" ")[0];
            String to = s.split(" ")[1];
            reportMap.get(to).add(from);
        }

        for(int i = 0; i < id_list.length; i++) {
            HashSet<String> sendMails = reportMap.get(id_list[i]);
            if(sendMails.size() >= k) {
                for(String mail : sendMails) {
                    answer[infoMap.get(mail)]++;
                }
            }
        }
        return answer;
    }
}
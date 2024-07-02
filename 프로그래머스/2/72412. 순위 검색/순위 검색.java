import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();

        for (String i : info) {
            String[] data = i.split(" ");
            String[] languages = {data[0], "-"};
            String[] jobs = {data[1], "-"};
            String[] exps = {data[2], "-"};
            String[] foods = {data[3], "-"};
            Integer value = Integer.parseInt(data[4]);
            for(String lang : languages) {
                for(String job : jobs) {
                    for(String exp : exps) {
                        for(String food : foods) {
                            String[] keyData = {lang, job, exp, food};
                            String key = String.join(" ", keyData);
                            ArrayList<Integer> arr = hashMap.getOrDefault(key, new ArrayList<>());

                            arr.add(value);
                            hashMap.put(key, arr);
                        }
                    }
                }
            }
        }
        
        for (ArrayList<Integer> arr : hashMap.values()) 
            arr.sort(null);
        
        int[] answer = new int[query.length];
        int i = 0;
        for (String q : query) {
            String[] data = q.split(" and ");
            int target = Integer.parseInt(data[3].split(" ")[1]);
            data[3] = data[3].split(" ")[0];
            String key = String.join(" ", data);

            if (hashMap.containsKey(key)) {
                ArrayList<Integer> list = hashMap.get(key);
                int left = 0;
                int right = list.size();
                while(left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) >= target) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }

                answer[i] = list.size() - left;
            }
            i++;
        }

        return answer;

    }
}
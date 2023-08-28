import static java.lang.Integer.toBinaryString;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            String row = "";
            String arr1ToString = toBinaryString(arr1[i]);
            String arr2ToString = toBinaryString(arr2[i]);

            String addZeroArr1 = addZero(arr1ToString, n);
            String addZeroArr2 = addZero(arr2ToString, n);

            for(int j = 0; j < n; j++) {
                if(addZeroArr1.charAt(j) == '1' || addZeroArr2.charAt(j) == '1') {
                    row += "#";
                }else {
                    row += " ";
                }
            }
            answer[i] = row;
        }

        return answer;
    }

    static String addZero(String arr, int n) {
        if(arr.length() != n) {
            String zero = "";
            for(int j = 0; j < n - arr.length(); j++) {
                zero += "0";
            }
            arr = zero + arr;
        }
        return arr;
    }
}
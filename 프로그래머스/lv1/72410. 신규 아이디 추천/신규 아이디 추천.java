class Solution {
    public String solution(String new_id) {
         // 대문자 -> 소문자로 치환
            String answer = new_id.toLowerCase();

        // 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
        answer = answer.replaceAll("[.]{2,}",".");

        // 마침표과 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 빈 문자열이라면 "a" 를 대입
        if(answer.isEmpty()) {
            answer += "a";
        }

        // 16자 이상이면 첫 15개의 문자를 제외한 나머지 문자 제거
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");

        // 길이가 2 이하라면 마지막 문자를 3이 될 때까지 반복해서 끝에 붙인다.
        if(answer.length() <= 2) {
            while(answer.length() < 3) {
                char c = answer.charAt(answer.length() - 1);
                answer += c;
            }
        }


        return answer;
    }
}
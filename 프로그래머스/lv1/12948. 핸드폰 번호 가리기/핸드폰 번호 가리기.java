class Solution {
    public String solution(String phone_number) {
        String substring = phone_number.substring(0, phone_number.length() - 4);

        String replaceString = substring.replaceAll("[0-9]", "*");

        return replaceString + phone_number.substring(substring.length());
    }
}
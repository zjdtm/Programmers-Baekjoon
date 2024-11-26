class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int convertVideo = convertToSeconds(video_len);
        int convertPos = convertToSeconds(pos);
        int convertOpStart = convertToSeconds(op_start);
        int convertOpEnd = convertToSeconds(op_end);
        
        convertPos = skipOp(convertPos, convertOpStart, convertOpEnd);
        
        for (String command : commands) {
            
            if (command.equals("next"))
                convertPos = Math.min(convertPos + 10, convertVideo);
            else
                convertPos = Math.max(convertPos - 10, 0);
            
            convertPos = skipOp(convertPos, convertOpStart, convertOpEnd);
        }
        
        return convertToString(convertPos);
        
    }
    
    public int skipOp(int p, int op_start, int op_end) {
        if (p >= op_start && p <= op_end)
            return op_end;
        
        return p;
    };
    
    public int convertToSeconds (String str) {
        String[] s = str.split(":");
        int mm = Integer.parseInt(s[0]);
        int ss = Integer.parseInt(s[1]);
        
        return mm * 60 + ss;
    };
    
    public String convertToString (int i) {
        
        int m = i / 60;
        int s = i % 60;
        
        return String.format("%02d:%02d", m, s);
        
    };
    
}
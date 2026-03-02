// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/340213

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoTime = toSeconds(video_len);
        int startTime = toSeconds(pos);
        int openingStart = toSeconds(op_start);
        int openingEnd = toSeconds(op_end);
        int now = openingStart <= startTime && startTime <= openingEnd ? openingEnd : startTime ;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]){
                case "next" : now += 10;
                    break;
                case "prev" : now -= 10;
                    break;
            }

            if(now < 0) now = 0;
            if(now > videoTime) now = videoTime;

            if(openingStart <= now && now <= openingEnd){
                now = openingEnd;
            }
        }

        int minutes = now / 60;
        int seconds = now % 60;

        return String.format("%02d:%02d", minutes, seconds);
    }

    public int toSeconds(String str){
        String[] arr = str.split(":");
        int seconds = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);

        return seconds;
    }
}
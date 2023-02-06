import java.util.HashMap;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for(int i=0; i<s1.length(); i++){ //build need.
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i),0)+1);
        }

        int right = 0;
        int left = 0;
        int start = 0;
        int valid = 0;
        int len = Integer.MAX_VALUE;

        while(right < s2.length()){
            char c = s2.charAt(right);
            if(need.containsKey(c)){
                int tmp = window.getOrDefault(c, 0);
                window.put(c, ++tmp);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            right++;

            while(valid == need.size()){
                if(right - left < len){
                    start = left;
                    len = right - left;
                }
                char d = s2.charAt(left);
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    int temp = window.getOrDefault(d, 0);
                    window.put(d, --temp);
                }
                left++;
            }
        }
        String subStr = len ==Integer.MAX_VALUE? "": s2.substring(start, start+len);
        return s1.length() == subStr.length()? true: false;
    }
}

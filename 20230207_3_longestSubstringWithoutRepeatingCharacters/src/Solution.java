import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0 ;
        int res = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            right++;
            int tmp = window.getOrDefault(c, 0);
            window.put(c, ++tmp);
            while(window.get(c) > 1){ //当右边框元素为冗余时, 右边框不回头，移动左边框直到不冗余。
                char d = s.charAt(left);
                left++;
                int temp = window.getOrDefault(d, 0);
                window.put(d, --temp);
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}

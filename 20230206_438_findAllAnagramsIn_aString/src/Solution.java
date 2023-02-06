import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 *
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<p.length(); i++){
            need.put(p.charAt(i), need.getOrDefault(p.charAt(i), 0)+1);
        }

        int left = 0;
        int right = 0;
        //int start = 0; 不需要，因为窗口的宽度固定。start 一直是 left.
        int valid = 0;
        //int len = Integer.MAX_VALUE; 不需要，因为窗口的宽度固定。

        while(right < s.length()){
            char c = s.charAt(right);
            if(need.containsKey(c)){
                int tmp = window.getOrDefault(c, 0);
                window.put(c, ++tmp);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            //right++; 这一步移到后面
            // 因为排列必须连续，不能中途有断：所以结束扩充的条件是窗口长度等于目标的长度；这一步相当于找可行解

            while(right - left + 1 == p.length()){
                if(valid == need.size()){
                    ans.add(left);
                }
                char d = s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    int temp = window.getOrDefault(d, 0);
                    window.put(d, --temp);
                }
            }
            right++;
        }
        return ans;
    }
}

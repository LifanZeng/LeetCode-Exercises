import java.util.HashMap;

public class Solution {
    public String minWindow(String s, String t){
        HashMap<Character, Integer> need = new HashMap<>(); //目标串
        HashMap<Character, Integer> window = new HashMap<>(); //窗口
        for(int i=0; i<t.length(); i++){ //按target要求建立好need目标串
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0)+1);
        }

        //初始化参数。
        int left = 0;
        int right = 0;
        int start = 0;
        int valid = 0; //窗口中满足need条件的字符个数，当和need.size相同就ok了。
        int len = Integer.MAX_VALUE;

        //滑动窗口框架总体思路：右边窗框右移扩大，确保包含need.　当包含后，左边窗框右移缩小以使窗口不臃肿。
        while(right < s.length()){//确保右边窗框不出界
            char c = s.charAt(right);
            if(need.containsKey(c)){//当need的key中有一个就是右窗边元素c
                int tmp = window.getOrDefault(c, 0);//tmp等于window中c对应的值或者０。
                window.put(c, ++tmp); //升级window中以ｃ为key对应的（key, value）记录。
                if(window.get(c).equals(need.get(c))){//不单String, 判断Integer是否相等同样需要用　.equals(..)
                    valid++;//当以ｃ为key的数量在window和need上相等时, valid增１(满足的条件多了１个).
                }
            }
            right++; //右边窗框右移扩大。window是左闭右开，通过tmp小步向前。

            while(valid == need.size()){//当窗口中已经包含所需字符时，左边窗框右移缩小以使窗口不臃肿。
                if(right - left < len){
                    start = left;
                    len = right - left;//len其实不是准确长度，和下面对应就好。
                }
                char d = s.charAt(left);//左边框的元素ｄ
                if(need.containsKey(d)){//如果ｄ是need中的key时
                    if(window.get(d).equals(need.get(d))){
                        valid--;//如果 window 和 need 上以d为可以得到的数量一致，而不是window上有盈余，则valid减１(满足的条件少了１个).
                    }
                    int temp = window.getOrDefault(d, 0);
                    window.put(d, --temp);//升级window中以ｄ为key对应的（key, value）记录。
                }
                left++;
            }
        }
        return len == Integer.MAX_VALUE? "": s.substring(start, start+len);//当len为Max时返回空字符，否则返回s.substring(start, start+len)。

        }
}

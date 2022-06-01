import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> left = new Stack<>();
        char temp;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                left.push(c);
            else{
                if(!left.empty())
                {
                    temp = left.pop(); //只是为了看 top 元素。
                    left.push(temp);}
                else
                    return false;
                if(!left.empty() && leftOf(c) == temp)
                    left.pop();
                else
                    return false;
            }
        }
        return left.empty();
    }

    char leftOf(char c){
        if(c=='}')
            return '{';
        if(c==')')
            return '(';
        return
                '[';
    }
}
package Stack;

import java.util.Stack;

public class KuoHao02 {
    public static boolean check(String str,int n){
        Stack<Character> stack=new Stack<>();
        if(str==null || str.length()==0){
            return false;
        }
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if(!stack.empty()){
            return false;
        }else{
            return true;
        }
    }
}

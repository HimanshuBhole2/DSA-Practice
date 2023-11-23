
import java.util.*;

public class valid_parenthesis {
    
    public static boolean check_paenthesis(String str){
        Stack<Character> s = new Stack<>();

        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i)=='['){
                s.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && s.peek() == '(' ){
                s.pop();
            }
            else if(str.charAt(i) == '}' && s.peek() == '{' ){
                s.pop();
            }
            else if(str.charAt(i) == ']' && s.peek() == '[' ){
                s.pop();
            }
            else{
                return false;
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(check_paenthesis("({[([)]]})"));
    }
}

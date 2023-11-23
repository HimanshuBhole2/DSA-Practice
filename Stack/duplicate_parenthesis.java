import java.util.Stack;

public class duplicate_parenthesis {
    
    public static boolean duplicate_paren(String str){
        Stack <Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!= ')'){
                s.push(ch);
            }
            else{
                if('('!=s.peek()){
                    while(s.peek()!='('){
                        s.pop();
                    }
                    s.pop();
                }else {
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        String str = "((a+b)+(c-d))";
        System.out.println(duplicate_paren(str));;
    }
}

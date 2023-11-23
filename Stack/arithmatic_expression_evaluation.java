import java.util.Stack;

public class arithmatic_expression_evaluation{

    public static void arithmatic_evoulation(String str){

        Stack<Character> st = new Stack<>();

        for(int i = 0;i< str.length();i++){
            char pointer = str.charAt(i);
            if((pointer-'0')>=0 && (pointer-'0')>=0 ){
                System.out.print(pointer);
            }
            else{
                if(pointer=='('){
                    st.push(pointer);
                }
                else if(pointer== ')'){
                    while(st.peek()!='('){
                        System.out.print(st.pop());
                    }
                    st.pop();
                }
                else{
                    int curr_pt_precedent = get_precident(pointer);
                    while(!st.isEmpty() && (get_precident(st.peek())>=curr_pt_precedent) && st.peek()!='('){
                        System.out.print(st.pop());
                    }
                    st.push(pointer);
                }
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.pop());
        }

    }

    public static int get_precident(char ch){
        if(ch=='+' && ch=='-'){
            return 1;
        }
        else if(ch=='*' && ch == '/'){
            return 2;
        }
        else if(ch=='^'){
            return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String expression = " ((2(3+5))*6)^(8+3)";
        arithmatic_evoulation(expression);
    }
}
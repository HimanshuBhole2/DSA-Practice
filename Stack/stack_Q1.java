import java.util.*;


public class stack_Q1 {
    
    public static Stack<Integer> insert(int data,Stack st){
        
      if(st.isEmpty()){
        st.push(data);
        return st;
      }  

      int da = (int) st.pop();
      st = insert(data, st);
      st.push(da);
      return st;

    }


    public static String reverseString(String str){
        Stack <Character> st = new Stack<>();
        int ind = 0;
        while(ind!= str.length()){
            st.push(str.charAt(ind));
            ind++;
        }

        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()){
            char neww = st.pop();
            sb.append(neww);
        }
        return sb.toString(); 

    }

    public static Stack<Integer> reverseAstack(Stack st){
       Stack <Integer> st2 = new Stack<>();
       while(!st.isEmpty()){
        st2.push((int)st.pop());
       }
       while(!st2.isEmpty()){
        st = insert((int) st2.pop(), st);
       }
       return st;
    }


    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        Stack <Integer> st2 = new Stack<>();
        insert(0, st);
        insert(2, st);
        insert(3, st);
        System.out.println(st);

        System.out.println(reverseAstack(st));
        System.out.println(st);
    }
}

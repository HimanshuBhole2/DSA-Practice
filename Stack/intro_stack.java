import java.util.ArrayList;

public class intro_stack{


    public static class Stack{
        public ArrayList <Integer> array = new ArrayList <>();

        public boolean isEmpty(){
            int size = array.size();
            if(size== 0){
                return true;
            }
            return false;
        }

        public boolean push(int data){
            array.add(data);
            return true;
        }

        public int pop(){
            int ele = array.get(array.size()-1);
            array.remove(array.size()-1);
            return ele;
        }

        public int peek(){
            return array.get(array.size()-1);
        }
    }

    public static void main(String[] args) {
      
        Stack st = new Stack();
        System.out.println(st.isEmpty());

        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
public class ith_bit {
    public static void main(String[] args){
        int n = 5;

        int i = 0;//i th Bit 

        int bitMathch = n<<i;

        if((n&bitMathch)==0){
            System.out.println("The "+ i +" th bit is : "+0);
        }else{
            System.out.println("The "+ i + " th bit is : "+1);
        }
    }
}

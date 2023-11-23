public class direction_unite_smallest_distance{
    
    public static float disp(String str ){
        int result =0;
        int x=0;
        int y = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='W'){x--;}
            else if(str.charAt(i)=='E'){x++;}
            else if(str.charAt(i)=='N'){y++;}
            else if(str.charAt(i)=='S'){y--;}
        }
        result = (x*x) + (y*y);
        return (float)Math.sqrt(result);


    }

    public static void main(String[] args){
        String str = "WNEENESENNN";
        System.out.println("THE Shortest Path is : " + disp(str));
    }


}
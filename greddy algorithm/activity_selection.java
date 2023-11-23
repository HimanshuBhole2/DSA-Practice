import java.util.*;
public class activity_selection {
    public static void main(String[] args) {
       int start[] = {1,3,0,5,8,5};
       int end[] = {2,4,6,7,9,9};

        // If it is Unsorted :

        int activities[][] = new int[start.length][3];
        for(int i = 0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
     }

        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));


        for(int i = 0;i<start.length;i++){
            System.out.println(i+ " => [ " +activities[i][1] + " " + activities[i][2] + " ]");
        }


        ArrayList <Integer> arr = new ArrayList<>();
       int count = 1;
       int min = activities[0][2];
       arr.add(0);
       for(int i = 1;i<end.length;i++){
         if(min<=activities[i][1]){
            min = activities[i][1];
            count++;
            arr.add(i);
         }
       }
       System.out.println(" No of Activity Selected is : "+count);
       System.out.println("The Activitys are selected are: "+ arr);
    }
}

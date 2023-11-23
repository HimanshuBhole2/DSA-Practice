import java.util.*;


public class job_sequencing_problem {
    public static class Job{
        int id;
        int profit;
        int deadline;

        Job(int id,int deadline,int profit){
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }
    }


    public static void main(String[] args) {
      
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs,(a,b)->b.profit - a.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int maxProfit = 0;
        int time = 0;
       for(int i = 0; i<jobs.size();i++){
            if(time<jobs.get(i).deadline){
                time++;
                seq.add(jobs.get(i).deadline);
                maxProfit += jobs.get(i).profit;
            }
       }

       System.out.println("The Profit  = " + maxProfit);
       System.out.println("The data is : " + seq);


    }
}

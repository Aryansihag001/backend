import java.util.Scanner;

public class minimumcostclimb {
    public static void main(String ags[]){
        System.out.println("enter the number of stairs");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cost[]=new int[n];
        System.out.println("enter the cost for each step");
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        

        System.out.println("minimun cost for "+n+" stairs is "+minimumcosr(cost));
        
    }

    public static int minimumcosr(int cost[]){
        int n=cost.length;
        if(n==0) return 0;
        if(n==1) return cost[0];

        int dp[]=new int[n+1];

        //base case

        dp[0]=0;
        dp[1]=0;

        for(int i=2;i<=n;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }
}

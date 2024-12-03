import java.util.Scanner;

public class minimum_coin {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }

        int ans=mincoin(coins, amount);
        if(ans==Integer.MAX_VALUE){
            System.out.println("not possible");
        }
        else{
            System.out.println(ans);
        }
    }
    public static int mincoin(int coin[],int amount){
        int dp[]=new int[amount+1];
        for(int i=0;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;

        for(int i=1;i<=amount;i++){
            for(int coins:coin){
                if(i-coins>=0&&dp[i-coins]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],dp[i-coins]+1);
                }
            }
        }
        return dp[amount];
    }
    
}

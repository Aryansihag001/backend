import java.util.Scanner;

public class adjacentsum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        int ans=maxadjsum(nums);
        System.out.println("maximum adj.sum is :"+ans);
    }

    public static int maxadjsum (int nums[]) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];

        }
        int exclu=0;
        int inclu=0;

        for(int num:nums){
            int current=Math.max(inclu,exclu+num);
            exclu=inclu;
           inclu=current;
        }
        return inclu;
    }
    
}

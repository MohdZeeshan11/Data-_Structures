import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
       int ans = fibo(n);
      // int ans = fibo(n,dp);
      
       System.out.println(n+"th fibonacci number is = "+ans);

    }
    
    //1.by using recursion --------
    public static int fibo(int n)
    {
      if(n<=1)
      return n;
      
      return fibo(n-1)+fibo(n-2);
    }
    //2. by using memoziation dp --------
    
    public static int fibo(int n,int[] dp)
    {
      if(n<=1)
      return dp[n] = n;
      
      if(dp[n] != -1)
      return dp[n];
      
      return dp[n] = fibo((n-1),dp)+fibo((n-2),dp);
    }
    
    
    //3. by using tabulation dp--------
    
    public static int fibo(int n,int[] dp)
    {
      dp[0] = 0;
      dp[1] = 1;
      for(int i = 2 ; i <= n ; i++)
      {
        dp[i] = dp[i-1]+dp[i-2];
      }
      return dp[n];
    }
    
    //4. by keeping previous variables
    
   public static int fibo(int n,int[] dp)
    {
      int prev1 = 0;
      int prev2 = 1;
      int curr = 0;
      for(int i = 2 ; i <= n ; i++)
      {
        curr = prev2+prev1;
        prev1 = prev2;
        prev2 = curr;
      }
      return curr;
    }
}









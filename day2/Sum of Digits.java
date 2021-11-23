public class DRoot {
  public static int digital_root(int n) {
     
    while(n>9)
      {
        int sum=0;
        int temp=n;
        int rem=0;
        while(temp>0)
        {
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;

        }
        n=sum;
      
       } 
        
      return n;
    }
  
}
public class FindDivisor {

  public long numberOfDivisors(int n) {
   
    int sum=0;
    for(int i=1;i<=n;i++)
      {
        if(n%i == 0)
          {
          sum=sum+1;
        }
    }
    return sum;
  }

}
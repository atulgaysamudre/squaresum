class squaresum
{
   public static void main(String[]args)
   {
   int i=1;
   int sum=0;
   System.out.println("number\tsquare");
   while(i<=10)
    {
      System.out.println(i+"\t"+i*i);
      sum=sum+(i*i);
      i++;
      }
       System.out.println("Total\t"+sum);
   }
}
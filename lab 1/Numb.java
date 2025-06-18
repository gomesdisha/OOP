public class Numb
{
  public static void main(String args[])
   {
     int a[],c,i,pos=0,neg=0,zero=0;
     for(i=0;i<10;i++)
     {
      c =Integer.parseInt(args[i]);
      if(c>0)
      {
       pos++;
      }
      else
      if(c<0)
      {
       neg++;
      }
      else
       zero++;
     }
     System.out.println("Number of positive numbers= "+pos);
     System.out.println("Number of negative numbers= "+neg);
     System.out.println("Number of zero numbers= "+zero);
   }
  }
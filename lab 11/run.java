class runnableimplement implements Runnable
{
    public void run()
    {
        for(int i=0;i<50;i++)
            System.out.println("Runnable "+i);
    }
}
class Mythread extends Thread
{
    public void run()
        {
            System.out.println("Start");
            for(int i=0;i<5;i++)
            {
                System.out.println(i);}
            try
            {
                Thread.sleep(1000);
     
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
            System.out.println("End");
        }
}
class L11Q1 
{   
    public static void main(String[] args) 
    {
        runnableimplement obj = new runnableimplement();
        Thread t2=new Thread(obj);
        t2.start();
    }
}
public class sleepmethodcontinuously {
    public static void main(String args[])
    {
     while(true)
     {
        System.out.println("GOOD MORNING");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("GOOD AFTERNOON");
        try{
            Thread.sleep(7000);
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("GOOD EVENING");
        try{
            Thread.sleep(9000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
     }
    }
}

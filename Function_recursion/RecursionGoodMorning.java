public class RecursionGoodMorning
{
   public static void main(String args[])
     {
        int no=5;
        show(no);
     }
    public static void show(int x)
      {
         if(x!=0)
          {
             System.out.println("Good morning");
             x=x-1;
             show(x);
          }
          else
           {
              System.out.println("End");
           }
      }
}
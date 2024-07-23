
class human{
   private int age=32;
   private String name="rev";
   public int getage()
   {
    return age;
   }
   public String getname()
   {
        return name;
   }

   public void setage(int a)
   {
    age=a;
   }
   public void setname(String n)
   {
    name=n;
   }
    
}
public class demo {
    
    public static void main(String args[]) 
{
   
    human obj=new human();
    obj.setage(25);
    obj.setname("harsha");
    

    System.out.println(obj.getname() + " : " + obj.getage());
 }
}

         
 
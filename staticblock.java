class mobile{
    int price;
    String brand;
    static String name;
    static{
        name = "phone";
        System.out.println("in static block");
    }

    public mobile()
    {
        brand="";
        price =10000;
        System.out.println("in constructor");
       
    }

    public void show()
    {
        System.out.println(brand + " : "+price +" : " + name);
    }
}
public class staticblock {
    
    public static void main(String args[]) 
{
    mobile obj=new mobile();
    obj.brand="smartphone";
    obj.price=1800;
    mobile.name="smartphone";
 
    mobile obj1=new mobile();
    obj1.price=230;
 }
}

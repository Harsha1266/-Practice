class student{
    int marks;
    String name;
}
public class foreach {
    
    public static void main(String args[]) 
{
        student s1=new student();
        s1.name="harsha";
        s1.marks=99;

        student s2=new student();
        s2.name="vp";
        s2.marks=99;
        
        student s3=new student();
        s3.name="bharath";
        s3.marks=99;


        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(student std : students )
        {
            System.out.println(std.name + " : " +std.marks);
        }
    }
}

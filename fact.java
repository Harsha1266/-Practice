import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int result=1;
        for(int i=x;i>0;i--)
        {
            result = result*i;
        
        }
        sc.close();
        System.out.println(result);



    
}
}
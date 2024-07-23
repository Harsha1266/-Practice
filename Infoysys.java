import java.util.Scanner;

public class Infoysys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monsters = sc.nextInt();
        int count=0;
        int initial_Strength = sc.nextInt();
        int arr[] = new int[monsters];
        var bonus = new int[monsters]; 
        int dummy[]=new int[monsters];
        dummy= arr.clone();
        for(int i=0;i<monsters;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<monsters;j++){
            bonus[j]=sc.nextInt();
        }
        for(int i=0;i<monsters;i++){
            if(dummy[i]<=initial_Strength){
                initial_Strength+=bonus[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
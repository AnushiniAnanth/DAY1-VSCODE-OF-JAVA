import java.util.Scanner;
public class maxThree {
    public static void main(String[] args){
        System.out.println("Enter  three Number: ");
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("A is greater");
            }
            else{
                System.out.println("C is greater");

            }
        }
        else
        {
            if(a>c){
                System.out.println("A is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }

    }

}

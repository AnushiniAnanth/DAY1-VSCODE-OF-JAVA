import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args){
        System.out.println("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The integer is even");
        }
        else{
            System.out.println("The integer is odd");
        }
    }

}

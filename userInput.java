import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the pi value");
        float pi = sc.nextFloat();
        System.out.println("enter the value of radius: ");
        int r = sc.nextInt();
        float radius = pi + r;
        System.out.println("the radius is: "+ radius);
    }
}

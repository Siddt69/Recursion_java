import java.util.Scanner;

public class gcd {
    public static int gcd(int a,int b){
        if(b%a==0) return a;
        return gcd(b%a,a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println((gcd(a,b)));
    }
}

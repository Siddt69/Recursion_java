import java.util.Scanner;

public class printNto1 {
    public static void print(int n){
        if(n<1) return;
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        print(n);
    }
}

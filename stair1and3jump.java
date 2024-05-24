import java.util.Scanner;

public class stair1and3jump {
    public static int st(int n){
        if(n<=2) return 1;
        return st(n-1)+st(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        System.out.println(st(n));
    }
}

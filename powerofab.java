import java.util.Scanner;

public class powerofab {
    public static int power(int a,int b){
        if(b==0) return 1;
        int ans = a*power(a,b-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base:");
        int a = sc.nextInt();
        System.out.print("enter the power:");
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}

import java.util.Scanner;

public class powerlogNTime {
    public static int pow(int a,int b){
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if(b%2==0) return ans * ans;
        else return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base:");
        int a = sc.nextInt();
        System.out.print("enter the power:");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
}

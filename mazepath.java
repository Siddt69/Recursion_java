import java.util.Scanner;

public class mazepath {
    public static int maze(int m , int n){
        if(m==1 || n==1) return 1;
        int rightway = maze(m,n-1);
        int downways = maze(m-1,n);
        int totaways = rightway+downways;
        return totaways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row:");
        int m = sc.nextInt();
        System.out.print("enter the column:");
        int n = sc.nextInt();
        System.out.print("number of ways:"+ maze(m,n));;
    }
}

import java.util.Scanner;

public class genratepranthesis {
    public static void parenthesis(int open, int close,int n,String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) parenthesis(open+1,close,n,s+"(");
        if(close<open) parenthesis(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parenthesis(0,0,n,"");
    }
}

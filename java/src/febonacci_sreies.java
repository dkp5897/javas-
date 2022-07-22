import java.util.Scanner;

public class febonacci_sreies {
    public static void main(String[] args) {
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("How many number  do you want in series: ");
        num = obj.nextInt();
        int r = sum(num);
        for (int i = 0; i <= num; i++) {
            System.out.println( r);
        }

    }

    static int sum(int a) {
        if (a == 1)
            return 0;
        else if (a == 2)
            return 1;
        else
            return (a - 1) + (a - 2);
    }
}

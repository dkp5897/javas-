import java.util.Scanner;

public class element_check {
    public static void main(String[] args) {

        int[] a = { 6, 12, 36, 86, 95, 45, 36, 778, 44, 1, 1, 3, 5, 8, 9 };
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.print("which number do you want to search: ");
        num = obj.nextInt();
        boolean isInArray = false;
        for (int element : a) {
            System.out.print(element + " ");
            if (element == num) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("\nthis number is present in the array.");
        } else {
            System.out.println("\nthis number is not present in the array.");
        }
    }

}

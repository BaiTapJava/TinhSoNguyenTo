import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("---- So nguyen To ------");
        int i = 2;
        boolean check = true;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao mot so: ");
        number = input.nextInt();

        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }

        if (check)
            System.out.println(number + " la so nguyen to.");
        else
            System.out.println(number + " khong phai so nguyen to.");

    }
}

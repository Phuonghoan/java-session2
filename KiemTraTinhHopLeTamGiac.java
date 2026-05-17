import java.util.Scanner;

public class KiemTraTinhHopLeTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 cạnh của tam giác
        System.out.print("Nhập cạnh 1: ");
        int a = scanner.nextInt();

        System.out.print("Nhập cạnh 2: ");
        int b = scanner.nextInt();

        System.out.print("Nhập cạnh 3: ");
        int c = scanner.nextInt();

        // Kiểm tra 3 cạnh có tạo thành tam giác không
        if (a <= 0 || b <= 0 || c <= 0 ||
                a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        } else {
            // Phân loại tam giác
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân.");
            } else if (a * a == b * b + c * c ||
                    b * b == a * a + c * c ||
                    c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        }

        scanner.close();
    }
}
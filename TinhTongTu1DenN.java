import java.util.Scanner;

public class TinhTongTu1DenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương N
        System.out.print("Nhập N: ");
        int n = scanner.nextInt();

        // Kiểm tra số hợp lệ
        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ.");
        } else {
            int sum = 0;

            // Dùng vòng lặp for để tính tổng từ 1 đến N
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // In kết quả
            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
        }

        scanner.close();
    }
}
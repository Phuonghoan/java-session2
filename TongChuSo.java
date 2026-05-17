import java.util.Scanner;

public class TongChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên N
        System.out.print("Nhập số nguyên N: ");
        int n = scanner.nextInt();

        // Nếu số âm thì chuyển thành số dương
        n = Math.abs(n);

        int sum = 0;

        // Tách từng chữ số và cộng lại
        while (n > 0) {
            int digit = n % 10;   // Lấy chữ số cuối
            sum += digit;         // Cộng chữ số vào tổng
            n = n / 10;           // Bỏ chữ số cuối
        }

        // In kết quả
        System.out.println("Tổng các chữ số là: " + sum);

        scanner.close();
    }
}
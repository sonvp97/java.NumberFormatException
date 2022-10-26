import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();scanner.nextLine();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();scanner.nextLine();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
    public void calculate(int x,int y){
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng của x + y là: " + a);
            System.out.println("Trừ của x - y là: " + b);
            System.out.println("Nhân của x * y là: " + c);
            System.out.println("Chia của x / y là: " + d);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}

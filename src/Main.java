import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap canh a: ");
            int a = sc.nextInt();
            System.out.println("Nhap canh b: ");
            int b = sc.nextInt();
            System.out.println("Nhap canh c: ");
            int c = sc.nextInt();
            Triangle.checkTriangle(a,b,c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
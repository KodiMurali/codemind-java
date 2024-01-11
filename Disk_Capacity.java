import java.util.*;

public class file1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = 512;

        int a = x * y * z * n;
        int c = a + a;

        System.out.println(c);
    }
}

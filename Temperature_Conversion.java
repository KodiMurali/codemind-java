import java.util.*;
class convert
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        float f;
        n = sc.nextInt();
        f = (float)(32+(n*1.8));
        System.out.format("%.2f",f);
    }
}
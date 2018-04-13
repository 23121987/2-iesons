package src.homework2;

public class Task2 {
    public static void main(String[] args) {
        nameMethod(2, 5);

    }

    public static void nameMethod(int m, int n) {
        int b = m;
        for (int i = n; i > 1; i--) {
            b = b * b;
        }
        System.out.println(b);
    }

}
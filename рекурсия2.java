
public class GCDExample {
    // Рекурсивная функция для нахождения НОД
    static int gcd(int a, int b) {
        if (b == 0) {         // (оператор if)
            return a;          // (оператор return)
        }
        return gcd(b, a % b);  // (оператор return, рекурсивный вызов, оператор %)
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("НОД(" + a + ", " + b + ") = " + gcd(a, b));
    }
}

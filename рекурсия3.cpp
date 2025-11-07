#include <iostream>
using namespace std;

// Рекурсивная функция для нахождения НОД
int gcd(int a, int b) {
    if (b == 0) {         // (оператор if)
        return a;          // (оператор return)
    }
    return gcd(b, a % b);  // (оператор return, рекурсивный вызов, оператор %)
}

int main() {
    int a = 48, b = 18;
    cout << "НОД(" << a << ", " << b << ") = " << gcd(a, b) << endl;
    return 0;
}

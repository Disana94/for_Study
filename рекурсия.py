
def gcd(a, b):
    if b == 0:              # (оператор if)
        return a             # (оператор return)
    return gcd(b, a % b)     # (оператор return, вызов функции gcd, оператор %)

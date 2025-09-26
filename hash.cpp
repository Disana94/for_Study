#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> hashTable;
    hashTable["apple"] = 3;
    hashTable["banana"] = 5;
    cout << hashTable["banana"] << endl; // 5
}
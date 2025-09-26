import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();
        hashTable.put("apple", 3);
        hashTable.put("banana", 5);
        System.out.println(hashTable.get("banana")); // 5
    }
}
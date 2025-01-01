import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hashing {

    // Very brute force approch
    public static void count() {
        int[] arr = { 1, 2, 5, 4, 5, 5, 7 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                count++;
            }
        }
        System.out.println(count);
    }

    // Simple integer hashing
    public static void hash() {
        int[] arr = { 1, 3, 2, 9, 8, 7, 5, 6, 3, 4, 3, 5, 3, 4, 1, 3 };
        int[] hash = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        System.out.println(hash[3]);
    }

    // Character hashing for small case only
    public static void charHash() {
        String s = "abvdabeahf";
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        System.out.println(hash['a' - 'a']);
    }

    // Character hashing for all characters
    public static void charHashAll() {
        String s = "AbvdAbeAhf";
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        System.out.println(hash['A']);
    }

    // Collection hash basics
    public static void basics() {

        // Declaration
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Insertion
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        // Iteration
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // Query
        if (map.containsKey("one")) {
            System.out.println("Yes one is present");
        } else {
            System.out.println("No one is not present");
        }

        // Get all the keys of the map
        System.out.println(map.keySet());

        // Get all the values of the map
        System.out.println(map.values());

        // getting specific value
        System.out.println(map.get("one"));

        // To remove the key value pair
        map.remove("one");
        System.out.println(map);
    }

    // Count char using colletion hashmap
    public static void hash1() {

        String s = "Hello world";

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap.get('H'));
    }

    public static void minMaxKey() {
        String s = "Hello world";
        HashMap<Character, Integer> countChar = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (countChar.containsKey(c)) {
                countChar.put(c, countChar.get(c) + 1);
            } else {
                countChar.put(c, 1);
            }
        }

        System.out.println(countChar.keySet());
        System.out.println(countChar.values());

        System.out.println(Collections.max(countChar.values()));
        System.out.println(Collections.min(countChar.values()));

    }

    public static void main(String[] args) {
        hashing h = new hashing();
        h.count();
        h.hash();
        h.charHash();
        h.charHashAll();
        h.basics();
        h.hash1();
        h.minMaxKey();
    }
}

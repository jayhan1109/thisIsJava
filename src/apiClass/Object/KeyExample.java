package apiClass.Object;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<>();
        hashMap.put(new Key(1), "Jay");
        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
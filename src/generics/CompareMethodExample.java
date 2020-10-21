package generics;

public class CompareMethodExample {
    // Can't use this
    // String str = Unit.compare("a","b");

    int result1 = Unit.compare(10, 20);
    int result2 = Unit.compare(12.4, 5);
}

class Unit {
    // Only Number or child type can come
    // Number, double, int, float, etc
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }
}


//
//class Pair<K, V> {
//    private K key;
//    private V value;
//
//    public Pair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public void setKey(K key) {
//        this.key = key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//
//    public void setValue(V value) {
//        this.value = value;
//    }
//}
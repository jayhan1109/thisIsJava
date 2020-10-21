package apiClass.arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println(index);

        Member m1 = new Member("Jay");
        Member m2 = new Member("Jason");
        Member m3 = new Member("Alina");

        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        index = Arrays.binarySearch(members, m1);
        System.out.println(index);
    }
}

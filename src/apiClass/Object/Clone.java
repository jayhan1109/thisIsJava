package apiClass.Object;

import java.util.Arrays;

public class Clone {
    public static void main(String[] args) {
        Member m1 = new Member("Jay");
        Member m2 = null;
        m1.car = new Car("Jason");

        try {
            m2 = (Member) m1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Change primitive type's value
        // This doesn't change m2
        m1.id = "Good";
        System.out.println(m1.id);
        System.out.println(m2.id);

        // Change reference type's value
        // This also change m2
        m1.tmp[0] = 100;
        System.out.println(Arrays.toString(m1.tmp));
        System.out.println(Arrays.toString(m2.tmp));

        m1 = null;
        System.gc();

    }
}

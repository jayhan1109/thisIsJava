package apiClass.Object;

import java.util.Arrays;

// This class override equals()
// to compare only id, not object address
public class Member implements Cloneable {
    public String id;
    public int[] tmp = {1, 2, 3, 4};
    public Car car;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (id.equals(member.id))
                return true;
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Member cloned = (Member) super.clone();
        // Deep copy of array
        // Arrays.copyOf is create new array and shallow copy,
        // but the elements are int they are primitive
        // so in this case it works as deep copy
        cloned.tmp = Arrays.copyOf(this.tmp, this.tmp.length);
        // Deep copy of an object
        cloned.car = new Car(this.car.model);
        return cloned;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Removed");
    }
}

package apiClass.Object;

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    // Override equals() to check Key's number
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Key) {
            Key compareKey = (Key) obj;
            if (this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    // Need to override hashcode() too
    @Override
    public int hashCode() {
        return number;
    }
}

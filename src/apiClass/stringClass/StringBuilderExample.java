package apiClass.stringClass;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create StringBuilder instance
        StringBuilder sb = new StringBuilder();

        // append
        sb.append("JAVA ");
        sb.append("STUDY.");

        // insert
        sb.insert(4, "6");

        // update
        sb.setCharAt(4, '8');

        // replace
        sb.replace(6, 13, "Book");

        // delete
        sb.delete(4, 5);

        // length
        int length = sb.length();

        // StringBuilder to String
        String str = sb.toString();
    }
}

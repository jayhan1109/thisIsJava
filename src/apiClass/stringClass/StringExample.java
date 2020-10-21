package apiClass.stringClass;

import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {
        // more than 1 delimiter => split
        String text1 = "Jay&Jason,Tyler,Alina-Yun";

        String[] names = text1.split("&|,|-");

        for (String n : names) {
            System.out.println(n);
        }
        System.out.println();

        // only 1 delimiter => StringTokenizer or split
        String text2 = "Jay/Jason/Tyler";

        // 1st way
        StringTokenizer st = new StringTokenizer(text2, "/");
        int countTokens = st.countTokens();
        for (int i = 0; i < countTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
        }
        System.out.println();

        // 2nd way
        st = new StringTokenizer(text2, "/");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}

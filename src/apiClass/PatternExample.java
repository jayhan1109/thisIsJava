package apiClass;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-[0-9]{3,4}-[0-9]{4}";
        String data = "010-123-4567";

        // use matches static method of Pattern class
        boolean result = Pattern.matches(regExp, data);

        if(result){
            System.out.println("Match");
        }else{
            System.out.println("Not Match");
        }
    }
}

package apiClass.Classclass;

import apiClass.Object.Member;

public class ClassExample {
    public static void main(String[] args) {
        Member m = new Member("Jay");
        Class clazz1 = m.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();

        try{
            Class clazz2 = Class.forName("apiClass.Object.Member");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
            System.out.println(clazz2.getPackageName());
        }catch (ClassNotFoundException e){
            System.out.println("Not Found");
        }
    }
}

package apiClass.Classclass;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            // Create class dynamically by name
            Class clazz = Class.forName("apiClass.Classclass.SendAction");
            // Class clazz = Class.forName("apiClass.Classclass.ReceiveAction");

            Action action = (Action) clazz.newInstance();
            action.execute();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

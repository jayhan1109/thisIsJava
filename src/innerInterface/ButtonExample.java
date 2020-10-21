package innerInterface;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("I'm anonymous");
            }
        });

        btn.touch();
    }
}

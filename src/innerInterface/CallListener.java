package innerInterface;

public class CallListener implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("Turn on the Phone");
    }
}

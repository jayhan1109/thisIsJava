package innerInterface;

public class Button {

    // Interface type field
    OnClickListener listener;

    // Polymorphism
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    // innerInterface.Button class's method
    void touch() {
        listener.onClick();
    }

    // Inner interface
    interface OnClickListener {
        void onClick();
    }
}

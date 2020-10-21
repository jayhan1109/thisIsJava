public interface RemoteControl {
    // constant
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // abstract method
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // default method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Muted");
        } else {
            System.out.println("Unmuted");
        }
    }

    // static method
    static void changeBattery(){
        System.out.println("Change Battery");
    }
}

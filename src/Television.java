public abstract class Television implements RemoteControl {
    // field
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Turn On TV");
    }

    // Television class didn't implement
    // turnOff() method
    // So, it should be set to abstract class

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Current volumne : " + volume);
    }
}

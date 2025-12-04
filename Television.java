public class Television extends Device {
    private int channel;
    private int volume;

    public Television() {
        this.channel = 1;
        this.volume = 10;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        showStatus();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Television ON - Channel: " + channel +
                    ", Volume: " + volume + "%");
        } else {
            System.out.println("Television is OFF.");
        }
    }
}

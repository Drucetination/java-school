package homework.lab8;

public class RadioAlarm implements RadioDevice, AlarmDevice {
    @Override
    public void changeFrequency() {
        System.out.println("Changing Frequency...");
    }

    @Override
    public void checkSignal() {
        System.out.println("Signal checking...");
    }

    @Override
    public void makeNoise() {
        System.out.println("AAAAAAAAAAAAA");
    }

    @Override
    public void setup() {
        System.out.println("Alarm setup finished");
    }
}

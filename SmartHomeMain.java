public class SmartHomeMain {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1);
        Television tv = new Television();
        Microwave mw = new Microwave();

        Device[] devices = { ac, lamp1, lamp2, tv, mw };

        System.out.println("\nTurning ON all devices:");
        Device.toggleDevices(devices, true);

        System.out.println("\nNumber of powered devices: " +
                Device.countPoweredOnDevices(devices));

        System.out.println("\nAdjusting some device settings:");
        ac.setTemperature(20);
        lamp2.setLightColor("White");
        tv.setVolume(30);
        mw.setTimer(60);

        System.out.println("\nTurning OFF all devices:");
        Device.toggleDevices(devices, false);
    }
}

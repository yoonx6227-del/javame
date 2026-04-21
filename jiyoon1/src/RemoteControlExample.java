public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television2();
        rc = new Audio();

        RemoteControl.changeBattery();
    }
}

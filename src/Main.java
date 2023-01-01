public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer.Builder("256 GB SSD","16GB DDr4")
                .setBluetoothEnabled(true).setWifiEnabled(false).build();

        System.out.println(computer.getHdd());
        System.out.println(computer.getRam());
        System.out.println(computer.isBluetooth());
        System.out.println(computer.isWifi());
    }
}
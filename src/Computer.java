public class Computer {

    private final String hdd;
    private final String ram;
    private final boolean bluetooth;  // opsiyonel
    private final boolean wifi;  // opsiyonel

    private Computer(Builder builder){
        this.hdd=builder.hdd;
        this.ram=builder.ram;
        this.bluetooth=builder.bluetooth;
        this.wifi=builder.wifi;
    }
    public String getHdd() {
        return hdd;
    }
    public String getRam() {
        return ram;
    }
    public boolean isBluetooth() {
        return bluetooth;
    }
    public boolean isWifi() {
        return wifi;
    }
    public static class Builder{

        private final String hdd;
        private final String ram;
        private boolean bluetooth;
        private boolean wifi;

        public Builder(String hdd,String ram){
            this.hdd=hdd;
            this.ram=ram;
        }
        public Builder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.bluetooth=isBluetoothEnabled;
            return this;
        }
        public Builder setWifiEnabled(boolean isWifi){
            this.wifi=isWifi;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }

    }
}

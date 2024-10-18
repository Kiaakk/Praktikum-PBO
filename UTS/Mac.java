package UTS;

public class Mac extends Laptop {
    String security;

    // Constructor
    public Mac(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai, String security) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.security = security;
    }

    // Method to display Mac data
    public void tampilMac() {
        tampilLaptop();
        System.out.println("Security            : " + security);
    }
}

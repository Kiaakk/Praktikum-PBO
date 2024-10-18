package UTS;

public class Windows extends Laptop {
    String fitur;

    // Constructor
    public Windows(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai, String fitur) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.fitur = fitur;
    }

    // Method to display Windows data
    public void tampilWindows() {
        tampilLaptop();
        System.out.println("Fitur               : " + fitur);
    }
}

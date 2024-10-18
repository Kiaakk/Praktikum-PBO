package UTS;

public class Laptop extends Komputer {
    String jnsBatrei;

    public Laptop() {

    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Baterai       : " + jnsBatrei);
    }
}
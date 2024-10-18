package UTS;
public class Komputer {
    String merk;
    int kecProsesor;
    int sizeMemory;
    String jnsProsesor;

    public Komputer() {

    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merk                : " + this.merk);
        System.out.println("Kecepatan prosesor  : " + this.kecProsesor);
        System.out.println("Memory size         : " + this.sizeMemory);
        System.out.println("Jenis Prosesor      : " + this.jnsProsesor);
    }
}
package UTS;

public class Pc extends Komputer {
    int ukuranMonitor;

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        tampilData();
        System.out.println("Ukuran Monitor      : " + ukuranMonitor + " inch");
    }
}

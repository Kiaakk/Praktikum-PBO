package UTS;

public class MainHizkia {
    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("============ UTS PRAKTIKUM PBO =============");
        System.out.println("============================================");
        System.out.println("Nama    : Hizkia Elsadanta");
        System.out.println("Kelas   : TI-2E");
        System.out.println("NIM     : 2341720253");
        System.out.println();

        Mac mac = new Mac("MacBook Pro", 3, 16, "Apple M1", "Lithium-polymer", "Touch ID");
        System.out.println("==========================================");
        System.out.println("================ DATA MAC ================");
        System.out.println("==========================================");
        mac.tampilMac();
        System.out.println();

        Windows windows = new Windows("Asus", 3, 8, "AMD", "Lithium-ion", "Cortana");
        System.out.println("==========================================");
        System.out.println("============== DATA WINDOWS ==============");
        System.out.println("==========================================");
        windows.tampilWindows();
        System.out.println();

        Pc pc = new Pc("HP", 4, 32, "Intel", 27);
        System.out.println("==========================================");
        System.out.println("================ DATA PC =================");
        System.out.println("==========================================");
        pc.tampilPc();
    }
}

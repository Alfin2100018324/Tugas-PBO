
public class Main {
    public static void main(String[] args) {
        Burung manuk = new Burung();
        Anggora anu = new Anggora();

        Hewan kewan = new Hewan();
        kewan.suara();
        kewan.caraJalan();

        Kucing meong = new Kucing();
        meong.setNama("Alfin");
        meong.setJenis("Kampung");
        System.out.println("Nama Kucing : " + meong.getNama());
        System.out.println("Jenis Kucing : " + meong.getJenis());
        System.out.print("Suara Kucing : ");
        meong.suara();
        System.out.print("Cara Berjalan Kucing : ");
        meong.caraJalan();
    }
}
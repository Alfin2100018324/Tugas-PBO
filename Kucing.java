public class Kucing extends Hewan {
    protected String nama;
    protected String jenis;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void suara() {
        System.out.println("Meowww");
    }

    @Override
    public void caraJalan() {
        System.out.println("Make 4 kaki...");
    }
}

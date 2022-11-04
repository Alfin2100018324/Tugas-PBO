public class Burung extends Hewan{
    protected String nama1;
    protected String jenis1;

    public String getNama1() {
        return nama1;
    }
    public void setNama1(String nama1) {
        this.nama1 = nama1;
    }

    public String getJenis1() {
        return jenis1;
    }
    public void setJenis1(String jenis1) {
        this.jenis1 = jenis1;
    }

    @Override
    public void suara() {
        System.out.println("Kukuruyukk");
    }

    @Override
    public void caraJalan() {
        System.out.println("Terbang");
    }
}

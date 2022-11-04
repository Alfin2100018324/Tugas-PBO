public class Anggora extends Kucing{
    private String asal;

    public String getAsal() {
        return asal;
    }
    public void setAsal(String asal) {
        this.asal = asal;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getJenis() {
        return super.getJenis();
    }

    @Override
    public void suara() {
        System.out.println("Meongg!!");
    }
    @Override
    public void caraJalan() {
        System.out.println("Pakai Kaki...");
    }
}

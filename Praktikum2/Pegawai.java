package Praktikum2;
public  class Pegawai implements Pendapatan {
   private String noInduk ;
   private String nama;
   double gajiPokok;
   Pegawai (){    
   }
    public String getNoInduk() {
        return noInduk;
    }
    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    @Override
    public double hitungGaji() {
        return getGajiPokok ();
    }
   
   
   
   
   
    
}

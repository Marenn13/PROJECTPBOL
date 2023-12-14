package Praktikum2;
public class Manager extends Pegawai implements TugasBelajar  {
  private double tunjanganJabatan;
  private double lembur;
  
  Manager (){   
  }
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void setTunjanganJabatan(double tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }
    public double getLembur() {
        return lembur;
    }
    public void setLembur(double lembur) {
        this.lembur = lembur;
    } 
  @Override
     public double hitungGaji() {
       return getGajiPokok()+ getTunjanganJabatan ()+ getLembur ();
    }
    @Override
    public boolean isSelesai() {
        return true;
    }
  
   
  
}

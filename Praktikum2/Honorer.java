package Praktikum2;
public class Honorer  extends Pegawai {
    private  double lemburan;
    
    Honorer (){
      
    }
    public double getLemburan() {
        return lemburan;
    }
    public void setLemburan(double lemburan) {
        this.lemburan = lemburan;
    }
     @Override
    public double hitungGaji() {
        return getGajiPokok() + getLemburan();
    }
    
}

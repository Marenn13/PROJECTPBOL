package Praktikum2;
public class Kantor {
    private  Manager manager;
    private  Marketing marketing;
    private  Pegawai []pegawai ;
    private  Honorer []honorer ;
    
    Kantor (){    
    }
    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public Marketing getMarketing() {
        return marketing;
    }
    public void setMarketing(Marketing marketing) {
        this.marketing = marketing;
    }
    public Pegawai[] getPegawai() {
        return pegawai;    }

    public void setPegawai(Pegawai[] pegawai) {
        this.pegawai = pegawai;
    }
    public Honorer[] getHonorer() {
        return honorer;
    }
    public void setHonorer(Honorer[] honorer) {
        this.honorer = honorer;
    }
    public double TotalGaji (){
      return manager.getGajiPokok() + manager.getLembur()+ manager.getTunjanganJabatan()+
              marketing.getGajiPokok()  + marketing.getBonus() + honorer[0].getGajiPokok() 
              + honorer[0].getLemburan()+ honorer[1].getGajiPokok()+ honorer[1].getLemburan() 
              + pegawai [0].getGajiPokok()+ pegawai [1].getGajiPokok();
    }
    
    
    
    
}

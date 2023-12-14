
package Praktikum1;

public class Mahasiswa extends Gedget{
    private String nim;
     private String nama;
    private Handphone handhpone;
    private Tablet tablet;
    private Laptop laptop;

    public Mahasiswa (){
        
    }
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Handphone getHandhpone() {
        return handhpone;
    }

    public void setHandhpone(Handphone handhpone) {
        this.handhpone = handhpone;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
 
}

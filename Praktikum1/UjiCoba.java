package Praktikum1;
public class UjiCoba {
    public static void main(String[] args) {
        Mahasiswa mhs =new Mahasiswa ();
        mhs.setNama("Marenn");
        mhs.setNim("225314182");
        
        Handphone hp = new Handphone ();
        hp.setMerk("Asus");
        hp.setWarna("Putih");
        hp.setProsesor("intel Atom Z3560");
        hp.setRam("2 GB");
        hp.setRom("16 GB");
        hp.setKonektivitas("GSM, HSPA, LTE");
        
        Tablet tbl= new Tablet ();
        tbl.setMerk("Samsung");
        tbl.setWarna("hitam");
        tbl.setProsesor("Marvell PXA1088");
        tbl.setRam("1,GB");
        tbl.setRom("8 GB");
        tbl.setKonektivitas("Wifi");
        
        Laptop ltp = new Laptop ();
        ltp.setMerk("Lenovo Think Pad T400");
        ltp.setWarna("Hitam");
        ltp.setProsesor("Core 2 Duo 2.53 GHZ");
        ltp.setRam("2 GB");
        ltp.setHardisk("160GB");
        ltp.setJumlahUSb(3);
        
        
        
        System.out.println("Nama "+ mhs.getNama());
        System.out.println("NIM  "+mhs.getNim());
        
                
        System.out.println("+--------------------------+----------------------------+---------------------------------+");
        System.out.println("|         Handphone        |     Tablet                 |         Laptop                  |");
        System.out.println("+--------------------------+----------------------------+---------------------------------+");
        System.out.println("|Merk:"+hp.getMerk()+"                 |Merk : "+tbl.getMerk()+"              |Merk : "+ltp.getMerk()+"      |");
        System.out.println("-------------------------------------------------------+---------------------------------+");
        System.out.println("|Warna:"+hp.getWarna()+"               |Warna : "+tbl.getWarna()+"               |Warna : "+ltp.getWarna()+"                    |");
        System.out.println("+--------------------------+----------------------------+---------------------------------+");
        System.out.println("|Prosesor:"+hp.getProsesor()+" |Prosesor : "+tbl.getProsesor()+"  |Prosesor : "+ltp.getProsesor()+"   |");
        System.out.println("+--------------------------+----------------------------+---------------------------------+");
        System.out.println("|Ram:"+hp.getRam()+"                  |Ram : "+tbl.getRam()+"                  |Ram : "+ltp.getRam()+"                       |");
        System.out.println("+--------------------------+----------------------------+---------------------------------+");
        System.out.println("|Rom:"+hp.getRom()+"                 |Rom : "+tbl.getRom()+"                  |Hardisk : "+ltp.getHardisk()+"                 |");
        System.out.println("+--------------------------+----------------------------+---------------------------------+");
        System.out.println("|Konektivitas:"+hp.getKonektivitas()+" |Konektivitas : "+tbl.getKonektivitas()+"        |Jumlah Port USB : "+ltp.getJumlahUSb()+" buah"+"         |");
         System.out.println("+--------------------------+----------------------------+---------------------------------+");
}
}

        
        
            
        
        
       
       
    
        
        
        
        
        
        
        
    
    


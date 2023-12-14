package Praktikum2;
public class UjiCoba {
    public static void main(String[] args) {
        Kantor kt = new Kantor();

        Manager mg = new Manager();
        mg.setNama("Maren");
        mg.setGajiPokok(600000);
        mg.setTunjanganJabatan(50000);
        mg.setLembur(100000);
        mg.isSelesai();
        kt.setManager(mg);

        Marketing mk = new Marketing();
        mk.setNama("Grace");
        mk.setGajiPokok(400000);
        mk.setBonus(100000);
        mk.isSelesai();
        kt.setMarketing(mk);

        Honorer hr[] = new Honorer[2];
        hr[0] = new Honorer();
        hr[0].setNama("Gabby");
        hr[0].setGajiPokok(300000);
        hr[0].setLemburan(50000);
        hr[1] = new Honorer();
        hr[1].setNama("Manggen");
        hr[1].setGajiPokok(500000);
        hr[1].setLemburan(200000);
        kt.setHonorer(hr);

        Pegawai pgw[] = new Pegawai[2];
        pgw[0] = new Pegawai();
        pgw[0].setNama("Rya");
        pgw[0].setGajiPokok(600000);
        pgw[1] = new Pegawai();
        pgw[1].setNama("gee");
        pgw[1].setGajiPokok(700000);
        kt.setPegawai(pgw);

        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|    STATUS\t|    NAMA\t|    GAJI POKOK\t|    TUNJANGAN\t|    LEMBUR\t|    BONUS\t|    GAJI TOTAL\t|     TUGAS BELAJAR\t");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------+");

        // Cetak data Manager
        Manager manager = kt.getManager();
        System.out.println("|    Manager\t|    " + manager.getNama() + "\t|    " + manager.getGajiPokok() + "\t|    " + manager.getTunjanganJabatan() + "\t|    " + manager.getLembur() + "\t|    -\t        |    " + manager.hitungGaji() + "\t|"     +manager.isSelesai() + "\t");

        // Cetak data Marketing
        Marketing marketing = kt.getMarketing();
        System.out.println("|    Marketing\t|    " + marketing.getNama() + "\t|    " + marketing.getGajiPokok() + "\t|    -\t        |    -\t        |    " + marketing.getBonus() + "\t|    " + marketing.hitungGaji() + "\t|"     +marketing.isSelesai() +"\t");

        // Cetak data Honorer
        Honorer[] honorer = kt.getHonorer();
        for (int i = 0; i < honorer.length; i++) {
            System.out.println("|    Honorer\t|    " + honorer[i].getNama() + "\t|    " + honorer[i].getGajiPokok() + "\t|    -\t        |    " + honorer[i].getLemburan() + "\t|    -\t        |    " + honorer[i].hitungGaji() + "\t|");
        }

        // Cetak data Pegawai
        Pegawai[] pegawai = kt.getPegawai();
        for (int i = 0; i < pegawai.length; i++) {
            System.out.println("|    Pegawai\t|    " + pegawai[i].getNama() + "\t|    " + pegawai[i].getGajiPokok() + "\t|    -\t        |    -\t        |    -\t        |    " + pegawai[i].hitungGaji() + "\t|");
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("               Total Gaji yang dikeluarkan oleh Kantor :" + kt.TotalGaji());
    }
}

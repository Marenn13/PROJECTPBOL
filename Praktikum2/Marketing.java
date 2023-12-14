package Praktikum2;

public class Marketing extends Pegawai implements TugasBelajar {

    private double bonus;

    Marketing() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double hitungGaji() {

        return getGajiPokok() + getBonus();

    }

    @Override
    public boolean isSelesai() {
        return true;
    }

}

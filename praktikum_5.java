public class praktikum_5 {
    public static void main(String[] args) {
        manajer manajer_1 = new manajer();
        programmer programmer_1 = new programmer();

        System.out.println("=== Manajer ===");
        Pegawai.infoPegawai("Andi Rianto");
        manajer_1.infoGaji(10000000);
        manajer_1.infoTunjangan(30000000);

        System.out.println("=== Prgrammer ===");
        Pegawai.infoPegawai("Yusuf Rahman");
        programmer_1.infoGaji(20000000);
        programmer_1.infoBonus(100000000);
    }
}

abstract class Pegawai {
    public static void infoPegawai(String nama) {
        System.out.println("Nama : " + nama);
    }
    public void infoGaji(int gaji) {
        System.out.println("Gaji : " + "Rp. " + gaji);
    };
}

class manajer extends Pegawai {

    public void infoTunjangan(int tunjangan) {
        System.out.println("Tunjangan : " + "Rp. " + tunjangan + "\n");
    }
}

class programmer extends Pegawai {

    public void infoBonus(int bonus) {
        System.out.println("Bonus : " + "Rp. " + bonus);
    }
}





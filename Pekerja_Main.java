package Cilsy;

class Pekerja{
    String nama;
    String gaji;
    public Pekerja (String nama, String gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
    public void tampilkanInformasi (){
        System.out.println(nama);
        System.out.println(gaji);
    }
}

class Manager extends Pekerja {
    String departemen;
    public Manager (String nama, String gaji, String departemen) {
        super (nama, gaji);
        this.departemen = departemen;
    }
    public void tampilkanInformasi (){
        super.tampilkanInformasi();
        System.out.println(departemen);
    }

}

public class Pekerja_Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Aldhia", "3,000,000");
        Manager manager1 = new Manager("Septian", "10,000,000", "Keuangan");
        pekerja1.tampilkanInformasi();
        manager1.tampilkanInformasi();
    }
}

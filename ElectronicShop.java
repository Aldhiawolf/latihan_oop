package Cilsy;

class Product {
    String nama;
    double harga;
    int stok;

    public double getDiscount(){
        if (stok >= 10){
            return 0.1;
        } else if (stok >= 5 && stok < 10) {
            return 0.05;
        } else {
            return 0;
        }
        }
    public double getHargajual(){
        return harga - (harga * getDiscount());
    }
}

class Elektronik extends Product{
    int berat;

    public double getHargaJual(){
        if(berat > 5){
            return harga - (harga * 0.15);
        } else {
            return harga - (harga * 0.1);
        }
    }
}

class Pakaian extends Product{
    String ukuran;

    public double getDiscount(){
        if(ukuran == "S" && ukuran == "M"){
            return 0.1;
        } else {
            return 0.05;
        }
    }
}

class Laptop extends Elektronik {
    public Laptop (String nama, double harga, int stok, int berat) {
        super.nama = nama;
        super.harga = harga;
        super.stok = stok;
        super.berat = berat;
    }
}

class Smartphone extends Elektronik {
    public Smartphone (String nama, double harga, int stok, int berat) {
        super.nama = nama;
        super.harga = harga;
        super.stok = stok;
        super.berat = berat;
    }
}

public class ElectronicShop {
    public static void main(String[] args) {
    Laptop laptop1 = new Laptop ("Macbook", 28000, 5, 5);
    Smartphone smartphone1 = new Smartphone ("iPhone", 20000, 1, 1);
    Smartphone smartphone2 = new Smartphone ("Samsung", 15000, 16, 9);
    Elektronik elektronik1 = new Elektronik ();
    elektronik1.nama = "TV";
    elektronik1.harga = 8000000;
    elektronik1.stok = 4;
    elektronik1.berat = 5;

    System.out.println(laptop1.getHargajual());
    System.out.println(smartphone1.getHargajual());
    System.out.println(smartphone2.getHargajual());
    System.out.println(elektronik1.getHargajual());
    }
}


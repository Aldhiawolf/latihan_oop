package Cilsy;
    class Harley extends Motor {
        int weight;

        public double getSalePrice() {
            if (weight > 2000) {
                return regulerPrice - (regulerPrice * 0.1);
            } else {
                return regulerPrice - (regulerPrice * 0.2);
            }
        }
    }
    class Honda extends Motor {
        int year;
        int manufacturerDiscount;

        public double getSalePrice() {
            return regulerPrice - manufacturerDiscount;
        }
        public Honda(int speed, double regulerPrice, String color, int year, int manufacturerDiscount) {
            super.speed = speed;
            super.regulerPrice = regulerPrice;
            super.color = color;
            this.year = year;
            this.manufacturerDiscount = manufacturerDiscount;
        }
    }

    class Yamaha extends Motor {
    int cubicalCentimeter;

    public double getSalePrice() {
        if (cubicalCentimeter > 250) {
            return regulerPrice - (regulerPrice * 0.15);
        } else {
            return regulerPrice - (regulerPrice * 0.1);
        }
    }

    public Yamaha(int speed, double regulerPrice, String color, int cubicalCentimeter) {
        super.speed = speed;
        super.regulerPrice = regulerPrice;
        super.color = color;
        this.cubicalCentimeter = cubicalCentimeter;
    }
}
    public class Motor {
            int speed;
             double regulerPrice;
             String color;
        public double getSalePrice() {
            return regulerPrice;
        }

        public static void main(String[] args) {
            Yamaha yamaha1 = new Yamaha(100, 35000, "white", 250);
            Honda honda1 = new Honda(100, 35000, "black", 1, 2000);
            Honda honda2 = new Honda(100, 50000, "grey", 2, 3000);
            Motor motor1 = new Motor();
            motor1.speed = 100;
            motor1.regulerPrice = 35000;
            motor1.color = "pink";

            System.out.println(yamaha1.getSalePrice());
            System.out.println(honda1.getSalePrice());
            System.out.println(honda2.getSalePrice());
            System.out.println(motor1.getSalePrice());
        }
    }

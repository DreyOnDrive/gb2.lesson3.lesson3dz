package gb2.lesson3.lesson3dz;

public class Main2 {
    public static void main(String[] args) {

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox1 = new Box();
        Box<Apple> appleBox2 = new Box();

        for (int i = 0; i < 2; i++) {
            orangeBox1.addFruits(new Orange());
        }

        for (int i = 0; i < 3; i++) {
            orangeBox2.addFruits(new Orange());
        }

        for (int i = 0; i < 4; i++) {
            appleBox1.addFruits(new Apple());
        }

        for (int i = 0; i < 5; i++) {
            appleBox2.addFruits(new Apple());
        }

        orangeBox1.printInformation();
        orangeBox2.printInformation();
        appleBox1.printInformation();
        appleBox2.printInformation();

        System.out.println("Сравним вес двух коробок " + orangeBox1.compareBox(orangeBox2));
        System.out.println("Сравним вес двух коробок " + appleBox1.compareBox(appleBox2));
        System.out.println("Сравним вес двух коробок " + orangeBox1.compareBox(appleBox1));
        System.out.println("Сравним вес двух коробок " + orangeBox2.compareBox(appleBox2));

        orangeBox1.move(orangeBox2);
        appleBox1.move(appleBox2);

        orangeBox1.printInformation();
        orangeBox2.printInformation();
        appleBox1.printInformation();
        appleBox2.printInformation();
    }
}

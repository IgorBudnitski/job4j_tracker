package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery bat1 = new Battery(76);
        Battery bat2 = new Battery(24);
        Battery bat3 = new Battery(0);
        System.out.println("Battery 1 has charge: " + bat1.load + "\nBattery 2 has charge: " + bat2.load);
        bat1.exchange(bat2);
        System.out.println("Battery 1 has charge: " + bat1.load + "\nBattery 2 has charge: " + bat2.load);
        bat3.exchange(bat1);
        System.out.println("Battery 1 has charge: " + bat1.load + "\nBattery 3 has charge: " + bat3.load);
    }
}

package gb2.lesson3.lesson3dz;

import java.util.ArrayList;

class Box <T extends Fruit> {
    private ArrayList<T> box;

    public Box() {
        box = new ArrayList<T>();
    }

    public ArrayList<T> getBox() {
        return box;
    }

    void addFruits(T obj) {
        box.add(obj);
    }

    void move(Box<T> box) {
        box.getBox().addAll(this.box);
        this.box.clear();
    }

    float getWeight() {
        if (box.isEmpty()) {
            return 0;
        } else {
            return box.size() * box.get(0).getWeight();
        }
    }

    void printInformation() {
        if (box.isEmpty()) {
            System.out.println("В этой коробке ничего нет");
        } else {
            System.out.println("В этой коробке " + box.get(0).toString() + ", " + box.size() + " штук(и) и вес этой коробки " + box.size() * box.get(0).getWeight());
        }
    }

    boolean compareBox(Box <? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}

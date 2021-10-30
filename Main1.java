package gb2.lesson3.lesson3dz;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {
        Obj obj1 = new Obj("obj1");
        Obj obj2 = new Obj("obj2");
        Obj obj3 = new Obj("obj3");
        Obj obj4 = new Obj("obj4");
        Obj obj5 = new Obj("obj5");

        Obj[] objs = {obj1, obj2, obj3, obj4, obj5};

        String[] strings = {"a", "б", "в", "г", "д", "е"};

        Integer[] integers = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(objs));
        System.out.println(Arrays.toString(exchange(objs, 0, 3)));

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(exchange(strings, 0, 3)));

        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(exchange(integers, 0, 3)));

    }

    private static <T> T[]  exchange(T[] objs, int index1, int index2) {
        T buffer = objs[index1];
        objs[index1] = objs[index2];
        objs[index2] = buffer;
        return objs;
    }
}

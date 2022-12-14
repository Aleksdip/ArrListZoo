package zoo;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Rat");
        animals.add(1, "Bull");
        animals.add(2, "Tiger");
        animals.add(3, "Rabbit");
        animals.add(4, "Dragon");
        animals.add(5, "Snake");
        animals.add(6, "Horse");
        animals.add(7, "Monkey");

        for (String a: animals) {
            System.out.println(a);
        }


    }
}


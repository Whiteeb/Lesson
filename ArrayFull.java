package ru.beliy_ev.lesson_3_1;

import java.util.ArrayList;

public class ArrayFull {
    public static void main(String[] args) {
        ArrayList<String> crh = new ArrayList<>();
        crh.add("КПРФ");
        crh.add("ЛДПР");
        crh.add("Единая россия");
        for (int i = 0; i < crh.size(); i++) {
            System.out.println(crh.get(i));
        }
    }


    public <T> void ChengArr(T[] arr, int a, int b) {
        T ter = arr[a];
        arr[a] = arr[b];
        arr[b] = ter;
    }

    public <T> void TransformationArr(T[] arr) {
        ArrayList<T> Gpp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Gpp.add(arr[i]);
        }

    }

    //////////////////////////
    public class Fruit<T> {
        private T TypeFruit;

        public Fruit(T TypeFruit) {
            this.TypeFruit = TypeFruit;
        }
    }

    public class Apple {
        public float Weight = 1.0f;
    }

    public class Orange {
        public float Weight = 1.5f;
    }

    public class Box<T> {
        ArrayList<T> AllBox;
        public Box() {
            AllBox = new ArrayList<>();
        }
        public void addBox() {
            T set = new T;
            AllBox.add((T) set);
        }

        public float getWeight() {
            int b = AllBox.size();
            float j;
            if (T instanceof Apple) {
                j = (float) b * 1.0f;
            } else {
                j = (float) b * 1.5f;
            }

            return j;

        }

        public boolean compare(Box obj) {
            float b = obj.getWeight();

            float c = this.getWeight();

            if (b == c) return true;

            else return false;

        }


    }


}

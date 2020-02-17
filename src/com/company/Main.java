package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // индекс - номер элемента в массива

        /* Collections - коллекции
            1) Set - множества
            2) List - списки (ArrayList vs Arrays)
               Пары обуви стоящие вдоль стены и у каждой пары есть свой номер(индекс)
            3) Map - карты (словари)
               Пары обуви, но у каждой есть имя

            Списки в Java: ArrayList, LinkedList...

         */
        int[] a = new int[4]; // массив с заданным размером
        List<Integer> b = new ArrayList<>(); // arraylist - 20

        a[1] = 100;
        /* добавляем в конец списка */
        b.add(14);
        b.add(5);
        b.add(900);

        /* добавляем в начало списка */
        b.add(0, 890);
        b.add(0, 33);

        b.set(0,899); // a[1] = 44;

        for (int i = 0; i < b.size(); i++) {
           // System.out.print(b.get(i) + " ");
        }

        // foreach
        for (Integer k : b) {
           // System.out.print(k + " ");
        }

        int x[] = {68,6,73,23,64,574,7777};
        // бинарный поиск
        Arrays.sort(x);
        for(int j=0;j<x.length;j++) System.out.print(x[j] + " ");
        int result = Arrays.binarySearch(x,9);
     //   System.out.println();
      //  System.out.println(result);

        // бинарный поиск для списка
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<x.length;i++) c.add(x[i]);
        int result2 = Collections.binarySearch(c,9);
        System.out.println();
       // System.out.println(result);

        List<City> cities = new ArrayList<>();
        cities.add(new City("Moscow",15000000));
        cities.add(new City("New-York",8000000));
        cities.add(new City("Berlin",12000000));
        cities.add(new City("Noginsk",101000));

        Comparator<City> sort_by = new Comparator<City>() {
            @Override
            public int compare(City city, City t1) {
                // 0 - объекты равны
                // <0 - меньше
                // >0 - больше
               // return t1.getPopulation()-city.getPopulation();
                return city.getName().compareTo(t1.getName());
            }
        };
        Collections.sort(cities,sort_by);
        for(City k: cities) {
            System.out.println(k.getPopulation() + " " + k.getName());
        }

        List<Car> cars = new ArrayList<>();
        Collections.sort(cars);
    }

}

package Home_Work_Java_GB;

import java.sql.SQLOutput;
import java.util.*;

public class HW_3 {
    //1.
    static ArrayList<Integer> nums = new ArrayList<>();


    public static void main(String[] args) {

// 1. Реализовать алгоритм сортировки списков компаратором.
        for (int i = 0; i < 10; i++) {
            nums.add(new Random().nextInt(10));
        }

        ArrayList<Integer> numsSort = new ArrayList<>(nums);

        numsSort.forEach(n -> System.out.print(n + " "));
        System.out.println();
        numsSort.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.print("sort: ");
        numsSort.forEach(n -> System.out.print(n + " "));
        System.out.println();


// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        ArrayList<Integer> numsOdd = new ArrayList<>(nums);
        Iterator<Integer> numsIterr = numsOdd.iterator();
        while (numsIterr.hasNext()) {
            int k = numsIterr.next();
            if (k % 2 == 0) numsIterr.remove();}
            System.out.print("Odds: ");
            numsOdd.forEach(n -> System.out.print(n + " "));
            System.out.println();


// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        ArrayList<Integer> numsArc=new ArrayList<>(nums);
        numsArc.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println("MIN: "+ numsArc.get(0));
        System.out.println("AVERAGE: "+ numsArc.get(numsArc.size()/2-1));
        System.out.println("MAX: "+ numsArc.get(numsArc.size()-1));

// 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        ArrayList<Integer> numsSet1=new ArrayList<>(nums);
        ArrayList<Integer> numsSet2=new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(10); i++) {
            numsSet2.add(new Random().nextInt(10));
        }
        numsSet1.forEach(n-> System.out.print(n+" "));
        System.out.println();
        numsSet2.forEach(n-> System.out.print(n+" "));
        System.out.println();
        numsSet1.removeAll(numsSet2);
        System.out.println("set: "+ numsSet1);

// 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        ArrayList<Integer> nums10000= new ArrayList<>();
        long start1=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            nums10000.add(0);
        }
        long stop1=System.currentTimeMillis();
        long time1= (stop1-start1);
        System.out.println("time1: " + time1);

// 6. Повторить пятый пункт но с LinkedList.
        LinkedList<Integer> numsLink=new LinkedList<>();
        long start2=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            numsLink.add(0);
        }
        long stop2=System.currentTimeMillis();
        long time2= (stop2-start2);
        System.out.println("time2: " + time2);


// 7. Сравнить время работы пятого и шестого пунктов.
        if( time1>time2) System.out.println("LinkedList быстрее");
        else if( time1<time2) System.out.println("ArrayList быстрее");
        else System.out.println("Равны");

    }
}
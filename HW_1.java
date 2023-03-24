package Home_Work_Java_GB;

import java.util.Random;

import static java.lang.Integer.highestOneBit;

public class HW_1 {
    static int i;
    static int n;
    static int[] m1= new int[100];
    static int ind=0;
    static int[] m2= new int[100];
    static int num=0;
    public static void main(String[] args) {
        //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        Random random = new Random();
        i = random.nextInt(2000);
        System.out.println(i);

        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        n = highestOneBit(i);
        System.out.println(n);

        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (i % n == 0) {
                int res = i / n;
                m1[ind] = res;
                ind++;
                System.out.println(res);
            }
        }
        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        for (int j = i; j < Short.MIN_VALUE; j++) {
            if (i % n == 1) {
                int res = i / n;
                m2[num] = res;
                num++;
                System.out.println(res);
            }
        }
}}
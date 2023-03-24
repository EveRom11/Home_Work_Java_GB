package Home_Work_Java_GB;

public class HW_2 {
    //1
    static String str= new String ("Как не стыдно тебе участвовать в подобных мероприятиях!");
    static String unStr= new String("тебе");
    //2
    static String st1= new String("Hogwarts");
    static String st2= new String("gwartsHo");
    //4
    static StringBuilder numbers= new StringBuilder("");
    //5
    static StringBuilder sum= new StringBuilder("3+56=59");
    static int ind= sum.indexOf("=");




    public static void main(String[] args) {
        //1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        System.out.println("1 --> " + str.contains(unStr));

        //2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        if (st1.length()==st2.length() && (st1+st1).contains(st2)) System.out.println("2 --> " + "Yes");
        else System.out.println("2 --> " + "No");

        //4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        System.out.println("4 --> " + numbers
                .append("3+56 = ")
              .append(3+56 + "; ")
                .append("3-56 = ")
              .append(3-56 + "; ")
                .append("3*56 = ")
              .append(3*56));

        //5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println("5 --> " + sum.deleteCharAt(ind).insert(ind, " равно "));

        //6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println("6 --> " +sum.replace(ind,ind, " равно "));


    }

}

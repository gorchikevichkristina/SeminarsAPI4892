package SeminarsAPI4892;

public class Task1 {
    public static void main(String[] args) {
        //примитивные типы данных (все они просто цифры, которые хранятся в стеке)
        byte b;
        short sh;
        int i;
        long l;

        float f;
        double d;

        char ch = 'c'; //индекс из таблицы
        boolean bl; // 0 или 1

        //ссылочные типы

        int[] ints = new int[10]; // массив объявление и инициализация
        int[] ints1 = new int[]{1, 2, 3, 4}; // АВТОинициализация
        int[] ints2 = {1, 2, 3};
        //массив не может быть динамическим, он статичен
        //можно создать временный массив, если нужно больше элементов
        int[] tmp = new int[ints.length + 1]; //доп массив для расширения длины массива
        for (int j = 0; j < ints.length; j++) {
            tmp[j] = ints[j];
        }
        ints = tmp;

        System.out.println(ints);//в работе sout очень редко используется
        //int.sout = System.out.println(ints);
    }
}

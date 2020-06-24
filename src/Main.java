import java.util.Scanner;

public class Main {
    //1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
    // при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа)
    // , должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
    // и вывести результат расчета.
    //4. Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
    //С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
    //
    //Возвращает кол-во оставшихся рабочих часов до конца
    //недели по заданному текущему дню. Считается, что
    //текущий день ещё не начался, и рабочие часы за него
    //должны учитываться.
    //
    //public class DayOfWeekMain {
    //
    //public static void main(final String[] args) {
    //System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    //}
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataExeption {
        String [] [] strarray = new String[4][4];
        arrvalue(strarray);


    }
    public static void arrvalue(String [] [] strarray) throws MyArraySizeException, MyArrayDataExeption {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int i = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int j = scanner.nextInt();
        try {
            strarray = new String[i][j];
            if (i != 4 & j != 4) {
                throw new MyArraySizeException("Ложные размеры массива");
            }
        } catch (MyArraySizeException e) {
            System.out.println("Ложные размеры массива, массив должен быть размером 4x4");
        }
        int sum = 0;
        int convertedVar = 0;
        try {
            for (int q = 0; q < i; q++) {
                for (int w = 0; w < j; w++) {
                    strarray[q][w] = "1";
                    System.out.print(strarray[q][w] + " ");
                }
                    System.out.println();
            }
            strarray[0][3] = " var";
            System.out.println();
            System.out.println();
            for (int m = 0; m < i; m++) {
                for (int n = 0; n < j; n++) {
                    char[] chars = (strarray[m][n]).toCharArray();
                    for (int k = 0; k < chars.length; k++) {
                        for (char o = 'a'; o <= 'z'; o ++) {
                            if (chars[k] == o) {
                                System.out.println("Ошибка в строке " + m + " " + n + "-го столбца" );
                                throw new MyArrayDataExeption("Data error");
                            }
                        }
                    }
                    convertedVar = Integer.parseInt(strarray[m][n].trim());
                    sum += convertedVar;
                }
                System.out.println();
            }
            System.out.println("Сумма равна " + sum);
        } catch (MyArrayDataExeption e) {
            System.out.println("Ошибка преобразования");
            System.out.println("Сумма равна " + sum);
        }
    }
    public static void getWorkingHours(DayOfWeek... workDays) {

    }

}

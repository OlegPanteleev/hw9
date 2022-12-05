package hw9;

public class Class1 {

    /*

    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
    подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
    просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
    ячейке лежит символ или текст вместо числа), должно быть брошено исключение
    MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    3. В методе main() вызвать полученный метод, обработать возможные исключения
    MyArraySizeException и MyArrayDataException и вывести результат расчета.
     */
    public static void main(String[] args) {

        String[][] array = new String[4][4];

        myArray(array);

    }

    public static void myArray(String[][] arr){

    }

}

abstract class myArrayException extends Exception{


}

class myArraySizeException extends myArrayException{

}

class myArrayDataException extends myArrayException{

}

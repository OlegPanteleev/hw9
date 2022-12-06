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



    }


}

class ArrayCheck{

    private String[][] array;

    public String[][] getArray() {
        return array;
    }

    public void setArray(String[][] array) {
        this.array = array;
    }

    public ArrayCheck(String[][] array) {
        this.array = array;
    }
}


abstract class MyArrayException extends Exception{

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyArrayException(String message, int x, int y) {
        super(message);
        this.x = x;
        this.y = y;
    }
}

class MyArraySizeException extends MyArrayException{


    public MyArraySizeException(String message, int x, int y) {
        super(message, x, y);
    }
}

class MyArrayDataException extends MyArrayException{


    public MyArrayDataException(String message, int x, int y) {
        super(message, x, y);
    }
}

/*class Check extends ArrayCheck{

    public static String counter;

    @Override
    int size(String[][] array) throws myArraySizeException {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array.length != 4 && array[i].length != 4){
                    throw new myArraySizeException("Некорректный размер массива", array);
                }
                else if (array.length == 4 && array[i].length == 4){
                    counter += array[i][j];
                }
            }
    }

    @Override
    int data(String[][] array) throws myArrayDataException {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (Integer.parseInt(array[i][j])){

                }
            }
        }
    }
}

 */

/*class ArrayCheck th{


    int size (String[][] array) throws{
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array.length != 4 && array[i].length != 4){
                    throw new myArraySizeException("Некорректный размер массива", array);
                }
                else if (array.length == 4 && array[i].length == 4){
                    return array;
                }

    }
}
    int data (String[][] array) throws myArrayDataException;
}

    /*abstract boolean size (String[][] array) throws myArraySizeException{
        int counter = 0;
        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4) {
                    throw new myArraySizeException("Некорректная длинна массива", array);
                }
                return true;
            }
        }

     */

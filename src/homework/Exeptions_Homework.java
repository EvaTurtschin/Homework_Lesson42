package homework;

public class Exeptions_Homework {
    /*
    1. Поймать исключение (с выводом на экран его типа), которое возникает при выполнении
    следующего кода int a = 40/0

    2. Поймать исключение (с выводом на экран его типа), которое возникает при выполнении
    следующего кода String s =null;
                    String m = s.toLowerCase()

    3. Поймать исключение (с выводом на экран его типа), которое возникает при выполнении
    следующего кода  int[] m = new int[2]
                     m[8]=5
     */

    public static void main(String[] args) {
        try {
            int a = 40 / 0;
        } catch (ArithmeticException exception){
            System.out.println("Arithmetic Exception occurred!");
        }

        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (NullPointerException exception){
            System.out.println("Null Pointer Exception occurred!");
        }

        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index Out Of Bounds Exception occurred!");
        }



    }
}

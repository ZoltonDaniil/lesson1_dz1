public class Lesson1 {
    public static void main(String[] args) {

        arithmeticMethod(3,4,5,6);
        comparisonMethod(7, 8);
        numberMethod(-1);
        System.out.println(printNameMethod("Петр"));
        leapYearMethod(1700);


        
    }

    private static void leapYearMethod(int year) {
        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    System.out.println( year +  " високосный.");
                }
                else System.out.println(year +  " не високосный");
            }
          else  System.out.println( year +  " високосный.");

        }
        else System.out.println(year +  " не високосный");


    }

    private static String printNameMethod(String name) {
        return "Привет, " + name +"!";

    }

    private static void numberMethod(int a) {
        if (a >= 0) System.out.println("Число " + a + " положительное.");
        else System.out.println("Число " + a +" отрицательное.");

    }

    private static boolean comparisonMethod(int a, int b) {
        if ((a+b)>10 && (a+b)<=20 ) return true;
        else return false;

    }

    private static double arithmeticMethod(int a, int b, int c, int d) {
        return  a * (b + ((double)c / d));
        /* Можно было умножить на 1.0  как было сказано на уроке a * (b + (1.0 * c / d))
            но я использовал приведение типов.
         */
    }
}

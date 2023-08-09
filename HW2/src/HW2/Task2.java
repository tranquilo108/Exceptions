package HW2;

/**
 * Если необходимо, исправьте данный код
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = null;
        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}

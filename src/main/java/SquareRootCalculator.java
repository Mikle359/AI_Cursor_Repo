public class SquareRootCalculator {

    /**
     * Calculates the square root of a given integer.
     *
     * @param number the integer to calculate the square root for
     * @return the square root of the number
     * @throws IllegalArgumentException if the number is negative
     */
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number: " + number);
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        // Demo usage
        int[] testNumbers = {0, 1, 4, 9, 16, 25, 100};
        
        for (int num : testNumbers) {
            System.out.println("Square root of " + num + " = " + calculateSquareRoot(num));
        }
    }
}

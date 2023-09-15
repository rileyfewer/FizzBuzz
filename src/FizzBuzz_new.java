/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz_new {

    public static void main(String[] args) {

        doFizzBuzzNew();
    }

    private static void doFizzBuzzNew() {
        int i = 1;
        while (i < 100) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0; i++;
            boolean divisibleBy5 = i % 5 == 0; i++;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }
}
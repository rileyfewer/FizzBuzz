public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                System.out.println(i);
            }
            if (divisibleBy5) {
                System.out.println(i);
            }
            if (divisibleBy3) {
                System.out.println(i);
            }
            i++;
        }
    }
}
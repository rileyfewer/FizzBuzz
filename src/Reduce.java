public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i = i / 2;
                count += 1;
            }
            if (i % 2 != 0) {
                i = i - 1;
                count += 1;
            }
        }
        System.out.println(count - 1);
        System.out.println(i);
    }}
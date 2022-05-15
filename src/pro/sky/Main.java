package pro.sky;

public class Main {
    public static void main(String[] args) {
        task4(new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'});
        task5("abcdeffgihklmop");
        task6(arr);
    }

    private static void task4(char[] reverseFullName) {
        reverseArray(reverseFullName);
    }

    private static void reverseArray(char[] reverseFullName) {
        int n = reverseFullName.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            if (i != reverseFullName.length - 1) {
                System.out.print(reverseFullName[i] + " ");
            } else {
                System.out.print(reverseFullName[i]);
            }
        }
        System.out.println();
    }

    private static void task5(String withDuplicates) {
        checkForDuplicate(withDuplicates);
    }

    private static void checkForDuplicate(String withDuplicates) {
        char[] charWithDuplicates = withDuplicates.toCharArray();
        for (int i = 0; i < withDuplicates.length() - 1; i++) {
            if (charWithDuplicates[i] == charWithDuplicates[i + 1]) {
                System.out.println("The string contains duplicate: " + charWithDuplicates[i]);
                return;
            }
        }
        System.out.println("The string doesnt contains duplicates");
    }

    private static void task6(int[] arr) {

        System.out.println("Monthly sum costs = " + String.format("%.2f", countMonthSumCosts()));
        System.out.println("Monthly avg costs = " + countMonthAvgCosts());
    }

    static int[] arr = generateRandomArray();

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static double countMonthSumCosts() {
        double sumMonthCost = 0;
        for (int j : Main.arr) {
            sumMonthCost = sumMonthCost + j;
        }
        return sumMonthCost;
    }

    private static String countMonthAvgCosts() {
        double monthLength = 30;
        double sumMonthCost = countMonthSumCosts();
        double avgMonthCost = sumMonthCost / monthLength;
        return String.format("%.2f", avgMonthCost);
    }
}


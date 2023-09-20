public class Main {

    public static void main(String[] args) {
        // 1. add

        int sumForTwo = add(3,8);
        System.out.println(sumForTwo);

        // 2. add

        int sumForFour = add(3,8,4,9);
        System.out.println(sumForFour);

        // 3. morningGreeting

        String goodMorning = "Toby Fox";
        System.out.println(morningGreeting(goodMorning));

        // 4. afternoonGreeting

        String goodAfternoon = "Mac Miller";
        System.out.println(afternoonGreeting(goodAfternoon));

        // 5. triple

        String tripled = "oohbaby";
        System.out.println(triple(tripled));

        // 6. half

        double halved = 17;
        System.out.println(half(halved));

        // 7. roundPositiveValueToNearestInteger

        double roundedPositive = 109.98;
        System.out.println(roundPositiveValueToNearestInteger(roundedPositive));

        // 8. roundNegativeValueToNearestInteger

        double roundedNegative = -56.83;
        System.out.println(roundNegativeValueToNearestInteger(roundedNegative));

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String myString) {
        return myString + myString + myString;
    }

    // 6. half
    public static double half(double toBeHalved) {
        return toBeHalved / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double toBeRoundedPositive) {
        if (toBeRoundedPositive % 1 < 0.5) {
            return (int) toBeRoundedPositive;
        }
        return (int) toBeRoundedPositive + 1;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double toBeRoundedNegative) {
        if (toBeRoundedNegative % -1 <= -0.5) {
            return (int) toBeRoundedNegative - 1;
        }
        return (int) toBeRoundedNegative;
    }
}

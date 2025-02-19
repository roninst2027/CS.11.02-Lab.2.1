/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Ronin Talwar 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum1 = add(3, 8);
        System.out.println("The sum of the 2 numbers is: " + sum1);
        int sum2 = add(3, 8, 4, 9);
        System.out.println("The sum of the 4 numbers is: " + sum2);
        String goodMorning = morningGreeting("Ronin");
        System.out.println(goodMorning);
        String goodAfternoon = afternoonGreeting("Ronin");
        System.out.println(goodAfternoon);
        String tripleString = triple("Ronin");
        System.out.println(tripleString);
        double halfNumber = half(17);
        System.out.println(halfNumber);
        int roundPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPositive);
        int roundNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNegative);
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        int firstSum = add(a, b);
        int secondSum = add(c, d);
        return add(firstSum,secondSum);
    }
    // 3. morningGreeting
    public static String morningGreeting(String a){
        return ("Good Morning " + a);
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String a){
        return ("Good Afternoon " + a);
    }
    // 5. triple
    public static String triple(String a){
        return a + a + a;
    }
    // 6. half
    public static double half(double a){
        return a/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) Math.round(a);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) Math.round(a);
    }

    

}
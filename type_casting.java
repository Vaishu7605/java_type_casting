
public class type_casting {

    public static void main(String[] args) {
        // integer to double
        int myInt = 78;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        // double to integer
        double myDoublee = 9.78d;
        int myIntt = (int) myDoublee;
        System.out.println(myDoublee);
        System.out.println(myIntt);

        // calculating % 
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100;
        System.out.println("User's percentage is " + percentage);

    }
}

package designPatterns.firstApproach;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection d1 = DatabaseConnection.getInstance();

        d1.setNum(100);

        System.out.println(d1.getNum());

        DatabaseConnection d2 = DatabaseConnection.getInstance();
        System.out.println(d2.getNum());

        System.out.println("Debug");
    }
}

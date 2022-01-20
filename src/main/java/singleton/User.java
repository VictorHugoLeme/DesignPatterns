package singleton;

public class User {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();

        System.out.println(logger1.log("Message 1"));
        System.out.print("Log count: ");
        System.out.println(logger1.printLogCount());

        Logger logger2 = Logger.getInstance();

        System.out.println(logger2.log("Message 2"));
        System.out.print("Log count: ");
        System.out.println(logger2.printLogCount());

        System.out.println(logger1.getLogs());

    }
}
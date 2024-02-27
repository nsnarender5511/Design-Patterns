

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log("Narender Singh");



        Logger logger1 = Logger.getLogger();
        logger1.log("NSH");

        Logger logger2 = logger1.clone();
        System.out.println(logger == logger2);

    }
}
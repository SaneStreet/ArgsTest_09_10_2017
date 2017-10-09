public class ArgsTest {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);

        if (args[0].equals("RocketLeague")) {
            System.out.println("Connected to Psyonix Servers.");
        } else
            System.out.println("Psyonix Server Testmode.");
    }
}
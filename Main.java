public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("server")) {
            Server.main(args);
        } else if (args.length > 0 && args[0].equals("client")) {
            Client.main(args);
        } else {
            System.out.println("Usage: java Main <server/client> [other args]");
        }
    }
}
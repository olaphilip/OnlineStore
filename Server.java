//Imports
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
   public static void main(String[] args) {
      try {
         StoreInterface store = new StoreImpl();
         Registry registry = LocateRegistry.createRegistry(4066);
         registry.bind("Store", store);
         System.out.println("Server started...");
         //keep in mind to unbind here to save resources
      } catch (Exception e) {
         System.err.println("Server exception: " + e.toString());
         e.printStackTrace();
      }
   }

}

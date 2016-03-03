package cdcollection;

/**
 *
 * @author Insert your name here
 */
public class CdCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CDList collection = new CDList();
        
        collection.add(new CD("Toxic", "Britney Spears", 5.50, 8));
        collection.add(new CD("Blurry Face", "Twenty One Pilots", 12.50, 12));
        collection.add(new CD("The Life of Pablo", "Kanye West", 100, 15));
        collection.add(new CD("To Pimp a Butterfly", "Kendrick Lamar", 15.50, 8));
        collection.add(new CD("Killer Whales", "Smallpools", 10, 7));
        
        System.out.println (collection);
        
        
    }
    
}

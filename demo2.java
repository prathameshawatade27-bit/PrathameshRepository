import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        HashSet<String> friendsSet = new HashSet<>();
        
        System.out.println("Enter the names of your friends:");
        for (int i = 0; i < n; i++) {
            friendsSet.add(scanner.nextLine());
        }
        
        // Using TreeSet to sort the names in ascending order
        TreeSet<String> sortedFriends = new TreeSet<>(friendsSet);
        
        System.out.println("\nFriends' names in ascending order:");
        for (String name : sortedFriends) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}

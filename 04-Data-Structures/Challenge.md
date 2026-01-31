# 🎵 Challenge: The Ultimate Playlist

**Topic**: Data Structures (ArrayList, HashSet)

## 📝 Problem Statement

You are building the backend for a music streaming app.
Users need to be able to create a playlist of their favorite songs.

Your system needs to handle:

1. **Dynamic Storage**: Users can add as many songs as they want (use `ArrayList`).
2. **Uniqueness**: A user cannot add the same song twice (use `HashSet` logic or `contains()` check).
3. **Management**: Users can remove songs they get bored of.

---

## 💻 Starter Code

Copy this code into `PlaylistManager.java`.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager {
    public static void main(String[] args) {
        // TODO 1: Create an ArrayList to store song names (Strings)
        ArrayList<String> playlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- 🎧 Music Manager ---");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Show Playlist");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter song name: ");
                String song = scanner.nextLine();
                
                // TODO 2: Add song ONLY if it's not already in the list
                // HINT: use playlist.contains(song)
                if (playlist.contains(song)) {
                     System.out.println("Error: Song already exists!");
                } else {
                     // ???
                     System.out.println("Added!");
                }
                
            } else if (choice == 2) {
                System.out.print("Enter song to remove: ");
                String song = scanner.nextLine();
                
                // TODO 3: Remove the song
                // playlist.remove(...)
                
            } else if (choice == 3) {
                System.out.println("Current Playlist (" + playlist.size() + " songs):");
                
                // TODO 4: Print all songs (loop)
                
            } else if (choice == 4) {
                break;
            }
        }
    }
}
```

---

## ✅ Acceptance Criteria

1. **No Duplicates**: Adding "Despacito" twice should fail the second time.
2. **Dynamic Sizing**: I should be able to add 100 songs without crashing.
3. **Accuracy**: Removing a song should actually delete it from the list.

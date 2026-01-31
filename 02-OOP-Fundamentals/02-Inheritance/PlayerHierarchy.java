// Superclass (Parent)
// Defines common properties and behaviors for ALL players.
class Player {
    String name;
    int age;
    String position;

    Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void play() {
        System.out.println(name + " is playing.");
    }

    void train() {
        System.out.println(name + " is training.");
    }
}

// Subclass (Child) for Cricket Player
// 'extends' keyword inherits everything from Player.
// Naming Convention: Fixed 'Cricket_Player' to 'CricketPlayer' (CamelCase).
class CricketPlayer extends Player {
    CricketPlayer(String name, int age, String position) {
        super(name, age, position); // 'super' calls the constructor of the Parent class.
    }

    // @Override annotation is a safety feature. It tells Java "I intend to replace
    // the parent's method".
    // If we misspelled 'playyy()', Java would show an error.
    @Override
    void play() {
        System.out.println(name + " is batting as " + position + ".");
    }

    @Override
    void train() {
        System.out.println(name + " is practicing cricket drills.");
    }
}

// Subclass for Football Player
class FootballPlayer extends Player {
    FootballPlayer(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing football as " + position + ".");
    }

    @Override
    void train() {
        System.out.println(name + " is doing football conditioning.");
    }
}

// Subclass for Hockey Player
class HockeyPlayer extends Player {
    HockeyPlayer(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing hockey as " + position + ".");
    }

    @Override
    void train() {
        System.out.println(name + " is doing hockey drills.");
    }
}

// Main Class
public class PlayerHierarchy {
    public static void main(String[] args) {
        // Polymorphism in action:
        // We declare variables of type 'Player' (Parent), but store 'CricketPlayer'
        // (Child) objects.
        // This works because a CricketPlayer IS-A Player.
        Player cricketPlayer = new CricketPlayer("Virat Kohli", 34, "Batsman");
        Player footballPlayer = new FootballPlayer("Lionel Messi", 36, "Forward");
        Player hockeyPlayer = new HockeyPlayer("Sandeep Singh", 38, "Defender");

        // Dynamic Method Dispatch:
        // Java decides AT RUNTIME which 'play' method to run based on the actual object
        // (CricketPlayer),
        // not the reference type (Player).
        cricketPlayer.play();
        cricketPlayer.train();

        footballPlayer.play();
        footballPlayer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
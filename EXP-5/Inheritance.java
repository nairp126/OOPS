// Superclass
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

// Subclass for Cricket Player
class Cricket_Player extends Player {
    Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

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
class Football_Player extends Player {
    Football_Player(String name, int age, String position) {
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
class Hockey_Player extends Player {
    Hockey_Player(String name, int age, String position) {
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
public class Inheritance {
    public static void main(String[] args) {
        Player cricketPlayer = new Cricket_Player("Virat Kohli", 34, "Batsman");
        Player footballPlayer = new Football_Player("Lionel Messi", 36, "Forward");
        Player hockeyPlayer = new Hockey_Player("Sandeep Singh", 38, "Defender");

        cricketPlayer.play();
        cricketPlayer.train();

        footballPlayer.play();
        footballPlayer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}

// The above code demonstrates the use of inheritance in Java.
// It includes the definition of a Player superclass and three subclasses: Cricket_Player, Football_Player, and Hockey_Player.
// Each subclass overrides the play() and train() methods to provide specific implementations for different sports. The main method creates instances of each subclass and calls their methods to demonstrate polymorphism and method overriding.
// This allows for code reuse and a clear structure for representing different types of players in a sports context.
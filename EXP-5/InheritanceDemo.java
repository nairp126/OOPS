
class Parent {
    private String privateData = "This is private data";

    // Public method to access private data
    public String getPrivateData() {
        return privateData;
    }
}

class Child extends Parent {
    public void showData() {
        // System.out.println(privateData); // Uncommenting this line will cause a compilation error

        // Correct way
        System.out.println(getPrivateData());
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.showData();
    }
}

// //     Player player1 = new Cricket_Player("John", 25, "Batsman");
//         Player player2 = new Football_Player("David", 28, "Forward");
//         Player player3 = new Hockey_Player("Wayne", 30, "Forward");
//
//         Player player4 = new Cricket_Player("Sachin", 45, "Batsman");
//         Player player5 = new Football_Player("Cristiano", 38, "Forward");
//         Player player6 = new Hockey_Player("Dhyan", 50,
//                 "Forward");
//
//         player1.play();  // Output: John is playing cricket as Batsman.
//         player2.play();  // Output: David is playing football as Forward.
//         player3.play();  // Output: Wayne is playing hockey as Forward.
//         player4.play();  // Output: Sachin is playing cricket as Batsman.
//         player5.play();  // Output: Cristiano is playing football as Forward.
//         player6.play();  // Output: Dhyan is playing hockey as Forward.
//
//         player1.train();  // Output: John is practicing cricket drills.
//         player2.train();  // Output: David is doing football conditioning.
//         player3.train();  // Output: Wayne is doing hockey drills.
//         player4.train();  // Output: Sachin is practicing cricket drills.
//         player5.train();  // Output: Cristiano is doing football conditioning.
//         player6.train();  // Output: Dhyan is doing hockey drills.
//
//         // Creating objects of subclasses 
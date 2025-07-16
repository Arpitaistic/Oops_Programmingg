public class RandomNo {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        int randomNo = (int)(Math.random () * 100); // Generates a random number between 0 and 99
        System.out.println("Random Number: " + randomNumber);
        System.out.println("Random No: " + randomNo);
    }
}

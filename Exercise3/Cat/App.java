public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("My cat eyes are a stunning " + myPet.eyeColor +" color.");
        System.out.println("My cat weighs " + myPet.weight +".");     
        System.out.println("My cat traits are " + myPet.characteristic +".");

    }
}

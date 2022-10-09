public class Runner {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            int randomNumber = (int) (Math.random() * 66) -15;
            System.out.println(randomNumber);
        }
    }
}

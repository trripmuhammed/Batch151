package socialMedia;

public class PremiumUser extends User {
        public void ads(){
            System.out.println("Premium ads izlemez");
        }
        @Override
        public void showinfo(){
            int age = 10;
            String name = "ali";
            String surname = "aslan";
        }
}

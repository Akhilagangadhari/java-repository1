public class CarFactory {
    public interface CardProvider {
        void swipe(float amt);
        String getBank();
    }
}

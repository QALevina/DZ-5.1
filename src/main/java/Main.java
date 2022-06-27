public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long initialAmount = 100;
        long refill = 1100;
        long amount = 100;
        boolean registered = true;
        long bonus = service.calculate(amount, registered);
        System.out.println("Вам начислен бонус: " + bonus);
        System.out.println("На Вашем счете: " + (initialAmount + refill + bonus));
    }
}
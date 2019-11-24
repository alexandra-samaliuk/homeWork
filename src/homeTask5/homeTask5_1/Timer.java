package homeTask5.homeTask5_1;

public class Timer implements TimeInterval {
    @Override
    public void time(int time) {
        System.out.println("Прошло " + time + " секунд");
    }
}

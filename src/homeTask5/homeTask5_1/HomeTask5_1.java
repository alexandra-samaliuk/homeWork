package homeTask5.homeTask5_1;

public class HomeTask5_1 {
    public static void main(String[] args) {
        int i = 0;
        Timer timer = new Timer();
        while (true){
            i++;
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer.time(i*10);
        }
    }
}

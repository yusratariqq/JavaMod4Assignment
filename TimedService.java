public class TimedService {
    @LogExecutionTime
    public void processData() {
        try {
            Thread.sleep(1000);
            System.out.println("Data processed");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

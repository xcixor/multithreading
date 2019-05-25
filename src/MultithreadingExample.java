public class MultithreadingExample implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread: " + Thread.currentThread().getId() + " is running");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

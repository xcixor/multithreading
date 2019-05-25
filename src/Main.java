public class Main {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            Thread thread = new Thread(new MultithreadingExample());
            thread.start();
            try{
                while (thread.isAlive()){
                    Thread.sleep(2000);
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Processor {

    public void produce() throws InterruptedException{
        synchronized(this){
            System.out.println("Producer thread running...");
            wait();

        }

    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        synchronized(this){

        }

    }
}

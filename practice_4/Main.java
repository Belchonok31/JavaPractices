package practice_4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyExecutorService executorService = new MyExecutorService(5);
        for(int i = 0; i < 20; i++){
            executorService.submit(()->{
                System.out.println("A");
            });
            executorService.submit(()->{
                System.out.println("B");
            });
            Thread.sleep(1000);
            executorService.submit(()->{
                System.out.println("C");
            });
            executorService.submit(()->{
                System.out.println("D");
            });
        }
        executorService.submit(()->{
            System.out.println("The end");
        });
        executorService.shutdown();
    }
}

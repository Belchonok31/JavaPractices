package practice_3;
public class Main {
    private static final ThreadSafetyList<Integer> list = new ThreadSafetyList<>();
    private static final ThreadSafetyMap<Integer,Integer> map = new ThreadSafetyMap<>();

    public static void main(String[] args) {
        System.out.println("Размер Map: " + map.size());
        System.out.println("Размер List: " + list.size());
        Thread first = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                list.add(i);
            }
        });
        Thread second = new Thread(()->{
            for(int i = 1000; i < 2000; i++){
                list.add(i);
            }
        });
        Thread third = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                map.put(i,i);
            }
        });
        Thread fourth = new Thread(()->{
            for(int i = 1000; i < 2000; i++){
                map.put(i,i);
            }
        });

        first.start();
        second.start();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        third.start();
        fourth.start();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Размер Map: " + map.size());
        System.out.println("Размер List: " + list.size());
    }
}

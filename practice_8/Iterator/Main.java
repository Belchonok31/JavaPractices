package practice_8.Iterator;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Iterator iterator = numbers.get_Iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}

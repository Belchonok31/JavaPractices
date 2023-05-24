package practice_8.Iterator;

public class Numbers{
    private int[] numbers = new int[]{1,2,3,4,5};
    public Iterator get_Iterator(){
        return new Iterator_numbers();
    }
    private class Iterator_numbers implements Iterator{
        int chet=0;
        @Override
        public boolean hasNext(){
            if(chet<numbers.length) return true;
            else return false;
        }
        @Override
        public Object next(){
            if(this.hasNext()) return numbers[chet++];
            else return null;
        }
    }
}

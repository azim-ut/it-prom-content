package azim.array;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        if(items.length == count){
            int[] temp = new int[count*2];
            for (int i = 0; i<items.length; i++){
                temp[i] = items[i];
            }
            items = temp;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index>=items.length){
            throw new IllegalArgumentException();
        }
        for (int i = index; i<count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for (int i = 0; i< count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }
}

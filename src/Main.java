import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mystery implements Iterable<String> {

    @Override
    public Iterator<String> iterator() {
        return new MysteryIterator();
    }
}
class MysteryIterator implements Iterator<String> {
    MysteryIterator()
    {
        this('A', 'z'); // first line only
    }
    MysteryIterator(char min, char max) {
        c = min;
        this.max = max;
    }
    private char c, max;
    public String next()
    {
        return c++ + "";
    }
    public boolean hasNext(){
        return c <= max;
    }
}

public class Main {
    public static void main(String[] args) {
//        List<String> aList = new MyArrayList();
//        aList.add("A");aList.add("B");aList.add("C");aList.add("D");
//        for(String s : aList){
//            System.out.println(s);
//        }
//
//        Mystery m = new Mystery();
//        for( Iterator<String> it = m.iterator(); it.hasNext(); )
//        {
//            String s = it.next();
//            System.out.println(s);
//        }
//        for (String s : m) {
//            System.out.println(s);
//        }

//        for (String s : aList) {
//            System.out.println(s);
//        }
//        for (Iterator<String> iterator = aList.iterator();
//             iterator.hasNext();
//             ) {
//            String s = iterator.next();
//            System.out.println(s);
//        }
    }
}

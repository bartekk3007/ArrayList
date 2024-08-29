import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>(10);
        //arrayList.ensureCapacity(10);
        arrayList.add("Andrzej");
        arrayList.add("Bartek");
        arrayList.add("Czesław");
        System.out.println(arrayList);
        //arrayList.trimToSize(); //trimming ArrayList to current size
        arrayList.set(2, "Cezary");
        System.out.println(arrayList);
        arrayList.add(3, "Dariusz");
        System.out.println(arrayList);
        arrayList.remove(3);

    }
}
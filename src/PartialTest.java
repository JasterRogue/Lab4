import java.lang.reflect.Array;
import java.util.Arrays;

public class PartialTest {
    public static void main(String[] args)
    {
        int values[] = new int[10];
        values[0]=1;
        values[1]=634;
        values[2]=99;

        int size = PartialArray.insert(values, 3, 1, 5);

        System.out.print("New Size: " + size);
        System.out.print("\n" + Arrays.toString(values));

    }
}

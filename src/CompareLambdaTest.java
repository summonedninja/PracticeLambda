import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareLambdaTest {
    public static void main(String[] args) {
        String[] s1 = new String[]{"vccv","d","sdsdsd","qt", "tuf"};
        String[] s2 = new String[]{"vccv","d"};
        String[] s3 = new String[]{"vccv","d","sdsdsd","qt", "tuf","sdfsd", "yjdf"};
        String[] s4 = new String[]{"vccv","d","sdsdsd"};
        String[] s5 = new String[]{"vccv"};
        String[] s6 = new String[]{"vccv","d","sdsdsd","qt"};

        List<String[]> listArrays = new ArrayList<>();
        listArrays.add(s1);
        listArrays.add(s2);
        listArrays.add(s3);
        listArrays.add(s4);
        listArrays.add(s5);
        listArrays.add(s6);

        listArrays.sort((o1, o2) -> o1.length - o2.length);

        for(String[] arr : listArrays) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

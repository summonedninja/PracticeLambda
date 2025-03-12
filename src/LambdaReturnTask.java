
//Возвращаем лямюду как результат метода 
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LambdaReturnTask {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        Random random = new Random();
        int arraySize = random.nextInt(30);

        for (int i = 0; i < arraySize; i++) {
            integerList.add(random.nextInt(100));
        }
        System.out.println(integerList);

        System.out.println(action(integerList).execute(integerList));

    }


    interface Operations<V, T> {
        V execute(T t);
    }

    private static Operations action(List<Integer> list) {
        if (list.size() > 20) {
            Operations<Integer, List<Integer>> operationA = l -> {
                int sum = 0;
                for (int i : l)
                    sum = sum + i;
                return sum;
            };
            return operationA;
        } else if (list.size() > 10) {
            Operations<String, List<Integer>> operationB = l -> {
                String result = "";
                for (int i : l)
                    result = result + i;
                return result;
            };
            return operationB;
        } else {
            Operations<Integer, List<Integer>> operationC = l -> {
                Integer res = 1;
                for (int i : l)
                    res = res * i;
                return res;
            };
            return operationC;
        }
    }
}

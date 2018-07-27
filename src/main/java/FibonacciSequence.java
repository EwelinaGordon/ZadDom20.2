import java.util.ArrayList;

public class FibonacciSequence {

    public int sumOfPositivValue(ArrayList<Integer> list){
        int sum = 0;
        for (Integer integer : list) {
            if (integer%2==0){
                sum += integer;
            }
        } return sum;
    }

    public ArrayList<Integer> createSequenceUpTo(int maxValue) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
        int index = 0;

        fibonacciSequence.add(1);
        fibonacciSequence.add(2);

        boolean flag = false;

        while (!flag) {
            if (fibonacciSequence.get(fibonacciSequence.size() - 1) > maxValue) {
                fibonacciSequence.remove(fibonacciSequence.size() - 1);
                flag = true;
            } else {
                fibonacciSequence.add(fibonacciSequence.get(index) + fibonacciSequence.get(index + 1));
            }
            index += 1;
        } return fibonacciSequence;
    }}



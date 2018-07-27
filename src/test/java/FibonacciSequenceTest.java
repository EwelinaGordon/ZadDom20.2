import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class FibonacciSequenceTest {

    @Test
    public void shouldBeLastValueLowerThen4_000_000(){
    //given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        ArrayList<Integer> sequenceUpTo = fibonacciSequence.createSequenceUpTo(4000000);
        //when
        int lastValue = sequenceUpTo.get(sequenceUpTo.size()-1);
        //then
        Assert.assertThat(lastValue, CoreMatchers.is(3524578));
    }

    @Test
    public void shouldBe44(){
        //given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        ArrayList<Integer> sequenceUpTo = fibonacciSequence.createSequenceUpTo(90);
        //when
        int sum = fibonacciSequence.sumOfPositivValue(sequenceUpTo);
        //then
        Assert.assertThat(sum, CoreMatchers.is(44));
    }

    @Test
    public void shouldBe2(){
        //given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        ArrayList<Integer> sequenceUpTo = fibonacciSequence.createSequenceUpTo(3);
        //when
        int sum = fibonacciSequence.sumOfPositivValue(sequenceUpTo);
        //then
        Assert.assertThat(sum, CoreMatchers.is(2));
    }

    @Test
    public void shouldBe0(){
        //given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        ArrayList<Integer> sequenceUpTo = fibonacciSequence.createSequenceUpTo(0);
        //when
        int sum = fibonacciSequence.sumOfPositivValue(sequenceUpTo);
        //then
        Assert.assertThat(sum, CoreMatchers.is(0));
    }

}

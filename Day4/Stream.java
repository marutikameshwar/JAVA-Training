package Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String []args){
        List<Integer> number = Arrays.asList(2,3,5,6,7);
        List<Integer> square =  number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
    }
}

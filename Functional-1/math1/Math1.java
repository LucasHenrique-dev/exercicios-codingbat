package math1;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    //Retorne uma lista de inteiros cujos valores correspondam aos da lista original, porém acrescidos de 1 e
    //multiplicados por 10.

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n+1)*10)
                .collect(Collectors.toList());
    }
}

package firstLast6;

public class FirstLast6 {
    //Retorne true se há 6 dentro do Array como primeiro elemnto ou último, o Array deverá ter um "length" maior que 1.

    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }
}

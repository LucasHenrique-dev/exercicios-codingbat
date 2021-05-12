package groupSum6;

public class GroupSum6 {
    //Dado um Array numérico "nums" e um "target", retorne se é possível escolher uma combinação de números em "nums" que
    //resulte em "target", começando por "start", contudo toda ocorrência do número "6" não pode ser ignorada. Fazer
    //recursivamente, não sendo necessário possuir loopings.
    //Ex.:((0, [5, 6, 2], 8) → true; (0, [5, 6, 2], 9) → false; (0, [5, 6, 2], 7) → false).

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        if (groupSum6(start+1,nums,target-nums[start])) return true;
        return (nums[start] != 6 && groupSum6(start+1,nums,target));
    }
}

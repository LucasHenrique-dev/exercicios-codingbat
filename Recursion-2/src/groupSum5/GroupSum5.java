package groupSum5;

public class GroupSum5 {
    //Dado um Array numérico "nums" e um "target", retorne se é possível escolher uma combinação de números em "nums" que
    //resulte em "target", começando por "start". A regra é que todos os múltiplos de 5 devem ser escolhidos, porém se o
    //número imediatamente após for "1", então não deverá ser escolhido. Fazer recursivamente, não sendo necessário usar
    //loopings.
    //Ex.:((0, [2, 5, 10, 4], 19) → true; (0, [2, 5, 10, 4], 17) → true; (0, [2, 5, 10, 4], 12) → false).

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        boolean div5 = nums[start]%5 == 0, valido = true;
        if (start > 0) valido = nums[start] != 1 || nums[start-1]%5 != 0;
        if (div5 && groupSum5(start+1,nums,target-nums[start])) return true;
        if (valido && !div5 && groupSum5(start+1,nums,target-nums[start])) return true;
        return !div5 && groupSum5(start+1,nums,target);
    }
}

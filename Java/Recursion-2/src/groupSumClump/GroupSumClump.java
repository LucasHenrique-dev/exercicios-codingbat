package groupSumClump;

public class GroupSumClump {
    //Dado um Array numérico "nums" e um "target", retorne se é possível escolher uma combinação de números em "nums" que
    //resulte em "target", começando por "start", com a seguinte condição: se houver um grupo de números idênticos e
    //adjacentes, nenhum ou todos devem ser aceitos. Fazer recursivamente, podendo haver um looping para identificar a
    //extensão do grupo.
    //Ex.:((0, [2, 4, 8], 10) → true; (0, [1, 2, 4, 8, 1], 14) → true; (0, [2, 4, 4, 8], 14) → false).

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        int val = nums[start], tam = 0;
        if (start < nums.length-1 && nums[start] == nums[start+1]) {
            for (int i = start; i < nums.length; i++) {
                if (nums[i] == val) tam++;
                else break;
            }
        }
        if (tam == 0 && groupSumClump(start+1,nums,target-nums[start])) return true;
        if (tam == 0 && groupSumClump(start+1,nums,target)) return true;
        if (tam >= 1 && groupSumClump(start+tam,nums,target)) return true;
        return tam >= 1 && groupSumClump(start+tam,nums,target-(tam*nums[start]));
    }
}

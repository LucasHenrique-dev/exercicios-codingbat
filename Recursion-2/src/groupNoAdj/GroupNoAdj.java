package groupNoAdj;

public class GroupNoAdj {
    //Dado um Array numérico "nums" e um "target", retorne se é possível escolher uma combinação de números em "nums" que
    //resulte em "target", começando por "start". Porém, se um número for escolhido, o imediatamente a sua frente não
    //poderá ser usado. Fazer recursivamente, não sendo necessário possuir loopings.
    //Ex.:((0, [2, 5, 10, 4], 12) → true; (0, [2, 5, 10, 4], 14) → false; (0, [2, 5, 10, 4], 7) → false).

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        if (groupNoAdj(start+2,nums,target-nums[start])) return true;
        if (groupNoAdj(start+3,nums,target)) return true;
        return groupNoAdj(start+1,nums,target);
    }

    //CÓDIGO PARA VISUALIZAR O PROCESSO
    public boolean groupNoAdj_visualizar(int start, int[] nums, int target) {
        System.out.println(start + " >= " + nums.length);
        if (start >= nums.length) {

            System.out.println(target + " == 0");
            return target == 0;
        }
        System.out.printf("start=%d, target=%d\n",start+2,target-nums[start]);
        if (groupNoAdj_visualizar(start+2,nums,target-nums[start])) return true;

        System.out.printf("start=%d, target=%d\n",start+3,target);
        if (groupNoAdj_visualizar(start+3,nums,target)) return true;

        System.out.printf("start=%d, target=%d\n",start+1,target);
        return groupNoAdj_visualizar(start+1,nums,target);
    }
}

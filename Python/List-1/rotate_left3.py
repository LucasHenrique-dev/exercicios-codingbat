"""
Dada uma lista numérica de tamanho 3 ("nums"), retorne-a com os seus elementos deslocados
para a esquerda. Ex.:(([1, 2, 3]) → [2, 3, 1]; ([5, 11, 9]) → [11, 9, 5]).
"""


def rotate_left3(nums):
    if len(nums) != 1:
        return nums[1:] + nums[:1]
    else:
        return nums


print(rotate_left3([1, 2, 3, 4, 5]))

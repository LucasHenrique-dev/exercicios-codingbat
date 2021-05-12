"""
Dada uma lista numérica "nums", retorne true se ela possuir uma tamanho de pelo menos
"1" e o seu primeiro elemento coincidir com o último.
"""


def same_first_last(nums):
    return len(nums) >= 1 and nums[0] == nums[-1]


print(same_first_last([1, 2, 3, 1]))

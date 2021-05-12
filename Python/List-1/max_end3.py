"""
Dada uma lista numérica de tamanho 3 ("nums"), retorne outra que seja totalmente
preenchida pelo maior valor entre o primeiro elemento e o último.
"""


def max_end3(nums):
    return nums[0:1]*len(nums) if nums[0:1] > nums[-1:] else nums[-1:]*len(nums)


print(max_end3([1, 2, 3]))

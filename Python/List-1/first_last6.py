"""
Dada uma lista numérica "nums", retorne true se o seu primeiro ou último elemento
forem um "6". A lista terá um tamanho de pelo menos 1.
"""


def first_last6(nums):
    return nums[0] == 6 or nums[-1] == 6


print(first_last6([1, 2, 3]))

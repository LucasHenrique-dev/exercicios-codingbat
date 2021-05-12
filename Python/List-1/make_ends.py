"""
Dada uma lista numérica "nums", retorne outra que contenha o seu primeiro e último
elemento. A lista dado terá tamanho de pelo menos 1.
"""


def make_ends(nums):
    return nums[0:1] + nums[-1:]


print(make_ends([1, 2, 3]))

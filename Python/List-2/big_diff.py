"""
Dada uma lista numérica de tamanho 1 ou mais "nums", retorne a diferença entre
o maior e menor valor da mesma.
"""


def big_diff(nums):
    return max(nums) - min(nums)


print(big_diff([1, 2, 20, 13, 7]))

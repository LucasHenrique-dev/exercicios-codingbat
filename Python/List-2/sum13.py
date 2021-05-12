"""
Dada uma lista numérica "nums", retorne a soma de seus elementos (0 caso seja vazia).
Porém, se houver um "13" ele deverá ser ignorado, assim como o número
imediatamente a sua frente.
"""


def sum13(nums):
    soma = 0
    for i in range(len(nums)):
        if nums[i:i+1] != [13] and nums[i-1:i] != [13]:
            soma += nums[i]
    return soma


print(sum13([1, 2, 13, 2, 1, 13]))

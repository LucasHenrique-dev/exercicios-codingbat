"""
Dada uma lista numérica "nums", retorne a quantidade de números pares que ela
possui.
"""


def count_evens(nums):
    cont = 0
    for n in nums:
        if n % 2 == 0:
            cont += 1
    return cont


print(count_evens([1, 2, 3, 4]))

"""
Dada uma lista numérica "nums" de tamanho 3 ou mais, retorne a sua
"média centralizada". Sabendo que a média centralizada ignora o maior e o menor
valor (se houver repetido, ignora apenas 1).
Ex.:(([1, 2, 3, 4, 100]) → 3; ([1, 1, 5, 5, 10, 8, 7]) → 5; ([-10, -4, -2, -4, -2, 0]) → -3).
"""


def centered_average(nums):
    nums.sort()
    return sum(nums[1:-1])//len(nums[1:-1])


print(centered_average([1, 2, 3, 4, 100]))

"""
Dada uma lista numérica "nums" de tamanho 2, retorne true se ela possuir uma valor
"2" ou "3".
"""


def has23(nums):
    return nums.count(2) > 0 or nums.count(3) > 0


print(has23([1, 4]))

"""
Dada uma lista numérica "nums", retorne a soma de seus elementos, porém qualquer
número entre "6" e "7", inclusive, deverá ser ignorado da soma (toda ocorrência
de "6" terá um "7" correspondente).
Ex.:(([1, 2, 2]) → 5; ([1, 2, 2, 6, 99, 99, 7]) → 5; ([1, 1, 6, 7, 2]) → 4).
"""


def sum67(nums):
    has_6 = False
    soma = 0
    for n in nums:
        if n == 6:
            has_6 = True
        if not has_6:
            soma += n
        if n == 7:
            has_6 = False
    return soma


print(sum67([1, 2, 7, 2, 6, 99, 99, 7]))

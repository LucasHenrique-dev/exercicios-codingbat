"""
Retorne a soma dos dois números dados, exceto quando ele forem iguais, nesse caso
retorne o dobro da soma.
"""


def sum_double(a, b):
    if a != b:
        return a + b
    else:
        return 2 * (a + b)


print(sum_double(12, 4))

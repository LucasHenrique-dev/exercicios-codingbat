"""
Dada 2 Strings ("a" e "b"), retorne a concatenação das 2, exceto que não terá as
primeiras letras de cada string. Ambas as strings terão tamanho de pelo menos 1.
"""


def non_start(a, b):
    return a[1:] + b[1:]


print(non_start("ba", "abc"))

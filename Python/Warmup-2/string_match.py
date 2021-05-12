"""
Dada 2 Strings ("a" e "b"), retorne o número de substrings de tamanho 2 que ambas
possuem coincidentemente e no mesmo índice de local.
Ex.:(('xxcaazz', 'xxbaaz') → 3; ('abc', 'abc') → 2; ('abc', 'axc') → 0).
"""


def string_match(a, b):
    cont = 0
    for i in range(min(len(a), len(b))-1):
        if a[i:i+2] == b[i:i+2]:
            cont += 1
    return cont


print(string_match('xxcaazz', 'xxbaaz'))

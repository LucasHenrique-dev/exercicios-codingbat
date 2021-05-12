"""
Dada 2 Strings ("a" e "b"), retorne true se uma delas aparecer no fim da outra.
O programa não deve ser "case sensitive" (ter diferença entre maiúsculo e minúsculo).
Ex.:(('Hiabc', 'abc') → True; ('AbC', 'HiaBc') → True; ('abc', 'abXabc') → True).
"""


def end_other(a, b):
    menor = a.lower() if len(a) < len(b) else b.lower()
    maior = b.lower() if a == menor else a.lower()
    return maior.endswith(menor)


# OUTRO JEITO DE SE FAZER
def end_other_2(a, b):
    a = a.lower()
    b = b.lower()
    return b.endswith(a) or a.endswith(b)


print(end_other('abcXYZ', 'abcDEF'))

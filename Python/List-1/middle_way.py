"""
Dada 2 listas numéricas ("a" e "b") de tamanho 3, retorne uma nova contendo os
seus elementos do meio.
"""


def middle_way(a, b):
    return a[int(len(a)/2):int(len(a)/2)+1] + b[int(len(b)/2):int(len(b)/2)+1]


print(middle_way([1, 2, 3], [4, 5, 6]))

"""
Dada 2 listas numéricas ("a" e "b"), retorne true se elas começarem com o mesmo
elemento ou terminarem com o mesmo. Ambas terão tamanho de pelo menos 1.
"""


def common_end(a, b):
    return a[0] == b[0] or a[-1] == b[-1]


print(common_end([1, 2, 3], [7, 3]))

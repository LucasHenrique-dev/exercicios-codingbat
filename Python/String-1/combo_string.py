"""
Dada 2 Strings ("a" e "b"), retorne outra seguindo a lógica:
menor + maior + menor. As 2 strings não teram o mesmo tamanho, mas podem ser 0.
"""


def combo_string(a, b):
    menor = b if len(a) > len(b) else a
    maior = a if len(a) > len(b) else b
    return menor + maior + menor


print(combo_string("menos", "grande"))

"""
Dado 3 números inteiros ("a", "b" e "c"), retorne a sua soma, exceto se algum
deles for "13", desse modo nem ele e nem os números que estão a sua direita
contarão.
E.:((1, 2, 3) → 6; (1, 2, 13) → 3; (1, 13, 3) → 1).
"""


def lucky_sum(a, b, c):
    soma = 0
    if a != 13:
        soma += a
    else:
        return soma
    if b != 13:
        soma += b
    else:
        return soma
    return soma + c if c != 13 else soma


print(lucky_sum(2, 13, 4))

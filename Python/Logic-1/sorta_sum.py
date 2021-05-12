"""
Dado 2 números inteiros ("a" e "b"), retorne a sua soma, exceto quando ela estiver
no intervalo entre 10..19, inclusive, nesse caso retorne 20.
"""


def sorta_sum(a, b):
    return 20 if 10 <= a+b <= 19 else a+b


print(sorta_sum(11, 4))

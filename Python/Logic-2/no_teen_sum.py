"""
Dado 3 números inteiros ("a", "b" e "c"), retorne a sua soma, exceto quando algum
deles estiver entre 13..19, inclusive, desse modo devem ser desconsiderados, a
menos que o seu valor seja 15 ou 16. Para isso crie uma função auxiliar:
"def fix_teen(n):" que fará a análise do número de acordo com a regra e retornará
seu valor adaptado a mesma.
Ex.:((1, 2, 3) → 6; (2, 13, 1) → 3; (2, 1, 14) → 3).
"""


def no_teen_sum(a, b, c):
    soma = 0
    soma += fix_teen(a)
    soma += fix_teen(b)
    soma += fix_teen(c)
    return soma


def fix_teen(n):
    teen = [13, 14, 17, 18, 19]
    return n if n not in teen else 0


print(no_teen_sum(12, 2, 4))

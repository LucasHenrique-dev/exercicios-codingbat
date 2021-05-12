"""
Dado 3 números inteiros ("a", "b" e "c"), faça os devidos arredondamentos para o
valor mais próximo de um múltiplo de 10 (caso o dígito mais a direta for 5 ou mais,
arredonde para cima, do contrário para baixo) e retorne a sua soma. Para isso
crie um método auxiliar "def round10(num):" que será chamado 3 vezes e retornará
o valor adequado para a regra.
"""


def round_sum(a, b, c):
    soma = 0
    soma += round10(a)
    soma += round10(b)
    soma += round10(c)
    return soma


def round10(num):
    return (int(num / 10) + 1) * 10 if num % 10 >= 5 else int(num / 10) * 10


##############
# OUTRO JEITO DE SE FAZER
def round_sum_2(a, b, c):
    return round10(a) + round10(b) + round10(c)


def round10_2(num):
    mod = num % 10
    num -= mod
    if mod >= 5:
        num += 10
    return num

##############


print(round_sum(12, 15, 2))
print(round_sum_2(32, 25, 4))

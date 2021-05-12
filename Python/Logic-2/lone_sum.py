"""
Dado 3 números inteiros ("a", "b" e "c"), retorne a sua soma, exceto quando houver
número repetido, nesse caso ignore-os da soma.
"""


def lone_sum(a, b, c):
    soma = a + b + c
    if a == b or a == c:
        soma -= 2 * a
        if b == c:
            soma -= a
    elif b == c:
        soma -= 2 * b
    return soma


# UM JEITO MAIS SIMPLES E DIRETO
def lone_sum_2(a, b, c):
    sum_2 = 0
    if a != b and a != c:
        sum_2 += a
    if b != a and b != c:
        sum_2 += b
    if c != a and c != b:
        sum_2 += c

    return sum_2


print(lone_sum(3, 1, 2))
print(lone_sum_2(3, 1, 2))

"""
Dado 3 números inteiros ("a", "b" e "c"), retorne true se "b" ou "c" diferirem de
"a" por 1 ou menos e algum dos números diferir de 2 ou mais unidades em relação aos
outros.
"""


def close_far(a, b, c):
    if abs(a-b) <= 1:
        return abs(c-a) >= 2 and abs(b-c) >= 2
    if abs(a-c) <= 1:
        return abs(b-a) >= 2 and abs(b-c) >= 2
    return False


print(close_far(1, 2, 10))

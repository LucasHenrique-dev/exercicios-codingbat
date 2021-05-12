"""
Retorne true se o número dado estiver 10 unidades próximo a 100 ou 200.
"""


def near_hundred(n):
    return abs(100-n) <= 10 or abs(200-n) <= 10


print(near_hundred(83))

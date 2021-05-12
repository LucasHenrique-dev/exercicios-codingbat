"""
Dada um número inteiro "num", retorne true caso ele esteja 2 unidades próximas
de ser um múltiplo de 10.
"""


def near_ten(num):
    return num % 10 <= 2 or num % 10 >= 8


print(near_ten(10))

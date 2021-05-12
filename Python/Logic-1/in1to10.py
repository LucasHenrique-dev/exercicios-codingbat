"""
Dado um número inteiro "n", retorne true caso ele esteja no intervalo entre 1..10,
inclusive, a menos que "outside_mode" seja true, nesse caso retorne true se "n"
for menor ou igual a 1 ou maior ou igual a 10.
"""


def in1to10(n, outside_mode):
    if outside_mode:
        return n >= 10 or n <= 1
    return 1 <= n <= 10


print(in1to10(1, True))

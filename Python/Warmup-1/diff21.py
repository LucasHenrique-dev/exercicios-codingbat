"""
Retorne a diferença absoluta entre entre "n" e 21, exceto quando "n" for maior que 21,
nesse caso retorne o dobro da diferença absoluta.
"""


def diff21(n):
    if n > 21:
        return 2*(n-21)
    else:
        return 21 - n


print(diff21(12))

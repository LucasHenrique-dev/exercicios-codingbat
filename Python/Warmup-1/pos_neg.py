"""
Retorne true se um dos números dados for negativo e o outro positivo, exceto quando
o parâmetro "negative" for true, nesse caso retorne true quando ambos forem negativos.
"""


def pos_neg(a, b, negative):
    if negative:
        return a < 0 and b < 0
    else:
        return (a < 0 or b < 0) and (a >= 0 or b >= 0)


print(pos_neg(-4, -1, True))

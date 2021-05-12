"""
Dada uma String "str" e sabendo que o seu "front" são as 3 primeiras letras que lhe
formam, ou o que ele tiver até lá. Retorne uma nova string que seja uma cópia 3 vezes
do front.
"""


def front3(str):
    if len(str) < 3:
        front = str
    else:
        front = str[:3]
    return front*3


# MODO INSANO
def front3_2(str):
    return str[:3]*3


# JEITO MAIS EXPLICADO E PASSO A PASSO
def front3_3(str):
    # Figure the end of the front
    front_end = 3
    if len(str) < front_end:
        front_end = len(str)
    front = str[:front_end]
    return front + front + front

    # Could omit the if logic, and write simply front = str[:3]
    # since the slice is silent about out-of-bounds conditions.


print(front3("XBOX"))
print(front3_2("AB"))
print(front3_3("a"))

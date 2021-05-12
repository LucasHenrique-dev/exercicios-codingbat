"""
Dada uma String "str" e sabendo que o "front" é considerado as 3 primeiras letras que
a compõem, ou o que quer que ela tenha até lá. Retorne "n" cópias do "front" da string
dada.
"""


def front_times(str, n):
    front = 3
    if len(str) < 3:
        front = len(str)
    return str[:front]*n


print(front_times("SA", 3))

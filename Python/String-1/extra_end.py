"""
Dada uma String "str", retorne uma outra que seja uma cópia 3 vezes das suas
últimas 2 letras.
"""


def extra_end(str):
    return str[-2:]*3


print(extra_end("Hello"))

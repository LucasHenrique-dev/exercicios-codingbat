"""
Dada uma String "str", retorne outra que não contenha nem a primeira letra nem a
última.
"""


def without_end(str):
    return str[1:-1]


print(without_end("coding"))

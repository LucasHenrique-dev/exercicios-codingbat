"""
Dada uma String de tamanho par "str", retorne a sua primeira metade.
Ex.:(('WooHoo') → 'Woo'; ('abcdef') → 'abc'; ('HelloThere') → 'Hello').
"""


def first_half(str):
    return str[:int(len(str)/2)]


print(first_half("WooHoo"))

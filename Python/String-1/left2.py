"""
Dada uma String "str", retorne outra em que as 2 primeiras letras sejam reposicionadas
para o final. A string dada terá tamanho de pelo menos 2.
"""


def left2(str):
    return str[2:] + str[:2]


print(left2("lucas"))

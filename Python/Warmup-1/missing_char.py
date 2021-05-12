"""
Dado uma String "str", retorne uma nova onde será removido o caractere indicado por
"n", cujo valor será um válido (0..length-1, inclusive).
"""


def missing_char(str, n):
    return str[:n] + str[n+1:]


print(missing_char("hello", 2))

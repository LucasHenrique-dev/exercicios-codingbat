"""
Dada uma String "str", retorne true se nela possuir o mesmo número de ocorrências
das strings "cat" e "dog".
Ex.:(('catdog') → True; ('1cat1cadodog') → True; ('catcat') → False).
"""


def cat_dog(str):
    return str.count("cat") == str.count("dog")


print(cat_dog("catdog"))

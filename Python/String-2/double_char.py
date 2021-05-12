"""
Dada um String "str", retorne uma nova onde todas as palavras estejam dobradas.
Ex.:(('The') → 'TThhee'; ('AAbb') → 'AAAAbbbb'; ('Hi-There') → 'HHii--TThheerree').
"""


def double_char(str):
    new_str = ""
    for ch in str:
        new_str += ch*2
    return new_str


print(double_char("Gol"))

"""
Dada uma String "str", retorne uma nova onde os caracteres de inicio e fim sejam
trocados de lugar.
"""


def front_back(str):
    if len(str) <= 1:
        return str
    else:
        return str[-1] + str[1:-1] + str[0]


print(front_back("as"))

"""
Dada 2 Strings ("out" e "word") e sabendo que "out" tem tamanho 4 e é no estilo
"<<>>", retorne uma outra String em que "word" esteja no meio de "out".
Ex.:(('<<>>', 'Yay') → '<<Yay>>'; ('[[]]', 'word') → '[[word]]'; ('<<>>', 'WooHoo') → '<<WooHoo>>').
"""


def make_out_word(out, word):
    return out[:2] + word + out[2:]


print(make_out_word("[[]]", "World"))

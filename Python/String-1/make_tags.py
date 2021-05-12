"""
Dada 2 Strings ("tag" e "word"), retorne uma outra seguindo a seguinte lógica:
"<'tag'>'word'</'tag'>"
"""


def make_tags(tag, word):
    return "<{}>{}</{}>".format(tag, word, tag)


print(make_tags("i", "hello"))

"""
Dada uma lista numérica "nums", retorne a soma dos seus 2 primeiros elementos, ou que
quer que ela tenha até lá. Retorne 0 caso tenha tamanho 0.
"""


def sum2(nums):
    return sum(nums[:2])


print(sum2([1, 2, 2]))

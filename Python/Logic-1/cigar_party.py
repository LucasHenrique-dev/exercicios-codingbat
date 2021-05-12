"""
Retorne true se "cigars" estiver entre 40 e 60, inclusive, a menos que "is_weekend"
seja true, nesse caso não há limite superior.
"""


def cigar_party(cigars, is_weekend):
    if cigars >= 40:
        return cigars <= 60 or is_weekend
    return False


print(cigar_party(70, True))

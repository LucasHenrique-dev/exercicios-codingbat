"""
Dado um array numérico, retorne o número de "9" que ele possui.
"""


def array_count9(nums):
    return nums.count(9)


# UTILIZANDO UM FOR COM ITERADOR DE ELEMENTOS
def array_count9_2(nums):
    count = 0
    # Standard loop to look at each value
    for num in nums:
        if num == 9:
            count = count + 1

    return count


print(array_count9([1, 2, 9, 9]))
print(array_count9_2([9, 9, 9, 9]))

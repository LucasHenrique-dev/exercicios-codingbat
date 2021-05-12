"""
Dada um array numérico "nums", retorne true se um dos 4 elementos iniciais for um "9".
O "length" do array pode ser menor que 4.
"""


def array_front9(nums):
    return nums[:4].count(9) >= 1


# OUTRO JEITO MAIS EXPLICADO E PASSO A PASSO
def array_front9_2(nums):
    # First figure the end for the loop
    end = len(nums)
    if end > 4:
        end = 4

    for i in range(end):  # loop over index [0, 1, 2, 3]
        if nums[i] == 9:
            return True
    return False


print(array_front9([0, 1, 2, 9, 9]))

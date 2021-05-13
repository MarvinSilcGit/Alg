# Souce: https://www.techiedelight.com/find-pair-with-given-sum-array/
import random

par = []

array = []

Sum = 0

a = 0

for b in range(5):

    array.append(random.randint(1, 6))

    Sum = random.randint(1, 18)

for c in range(len(array)+1):

    if array[c] + a == Sum:

        print()

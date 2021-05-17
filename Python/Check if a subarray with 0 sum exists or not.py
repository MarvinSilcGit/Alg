# Source: https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
# Fix the variables names of past files;
import random

SubSet0, SubSet1, SubSet2 = {31}, {31}, {31}

MasterSet = []

Counter = 0

SetLen = 15

while Counter != SetLen//3+1:

    if Counter == 0:

        SubSet0.clear()

        SubSet1.clear()

        SubSet2.clear()

    else:

        SubSet0.add(random.randint(-30, 30))

        SubSet1.add(random.randint(-30, 30))

        SubSet2.add(random.randint(-30, 30))

    Counter += 1

MasterSet.append(SubSet0)

MasterSet.append(SubSet1)

MasterSet.append(SubSet2)

print(MasterSet)


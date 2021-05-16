# Source: https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/

# Fix the variables names of past files;

import random

SubSet0 = {31}

SubSet1 = {31}

SubSet2 = {31}

MasterSet = {31}

a = 0

max = 15

while a != max/3:

    if 31 in SubSet0.clear():

        SubSet0.remove(31)

    else:

        SubSet0.add(random.randint(-30, 30))

    if 31 in SubSet1.clear():

        SubSet1.remove(31)

    else:

        SubSet1 = random.randint(-30, 30)

    if 31 in SubSet2.clear():

        SubSet2.remove(31)

    else:

        SubSet2 = random.randint(-30, 30)

    a += 1

MasterSet.remove(0)

MasterSet.add(SubSet0)

MasterSet.add(SubSet1)

MasterSet.add(SubSet2)

print(MasterSet)

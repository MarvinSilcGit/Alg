# Source: https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
# Fix the variables names of past files;
import random

SubArr0, SubArr1, SubArr2, MasterArr = [], [], [], []

Counter, SetLen = 0, 15

while Counter != SetLen//3:

    SubArr0.append(random.randint(-30, 30))

    SubArr1.append(random.randint(-30, 30))

    SubArr2.append(random.randint(-30, 30))

    Counter += 1

MasterArr.append(SubArr0)

MasterArr.append(SubArr1)

MasterArr.append(SubArr2)

print(MasterArr)

for Counter2 in range(len(MasterArr[0])):
    print(MasterArr[Counter2])

    print(Counter2)

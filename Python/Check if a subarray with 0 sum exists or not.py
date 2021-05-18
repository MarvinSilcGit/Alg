# Source: https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
# Fix the variables names of past files;
import random

SubArr0, SubArr1, SubArr2, MasterArr = [], [], [], []

Counter, ArrLen, ZSum, ZSum1, ZSum2 = 0, 15, 0, 0, 0

while Counter != ArrLen//3:

    SubArr0.append(random.randint(-30, 30))

    SubArr1.append(random.randint(-30, 30))

    SubArr2.append(random.randint(-30, 30))

    Counter += 1

    if Counter == ArrLen//3:

        MasterArr.append(SubArr0)

        MasterArr.append(SubArr1)

        MasterArr.append(SubArr2)

        for Counter1 in range(len(MasterArr[0])):

            ZSum += MasterArr[0][Counter1]

        for Counter2 in range(len(MasterArr[1])):

            ZSum1 += MasterArr[1][Counter2]

        for Counter3 in range(len(MasterArr[2])):

            ZSum2 += MasterArr[2][Counter3]

print(MasterArr)

if ZSum == 0:

    print("The Subarray 0", MasterArr[0], " is sum 0")

elif ZSum1 == 0:

    print("The Subarray 1", MasterArr[1], " is sum 0")

elif ZSum2 == 0:

    print("The Subarray 2", MasterArr[2], " is sum 0")

elif ZSum and ZSum1 and ZSum2 == 0:

    print("All the Subarrays are sum 0")

def par(x):

    return x % 2 == 0


def parimpar(x):

    if par(x):

        return "par"

    else:

        return "impar"


print(parimpar(4))

print(parimpar(5))

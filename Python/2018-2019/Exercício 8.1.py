def maiorValor(x,w):
    if x>w:
        return("O valor %s é maior!"%x)
    elif x<w:
        return("O valor %s é maior!"%w)
    elif x==w:
        return("Valores equivalentes!")
while True:
    while True:
        print()
        x=input("Digite o primeiro valor: ")
        if x.isdigit()==False:
            print()
            print("Digite somente números!")
            continue
        while True:
            print()
            w=input("Digite o segundo valor: ")
            if w.isdigit()==False:
                print()
                print("Digite somente números!")
                continue      
            print()
            print(maiorValor(x,w))
            break


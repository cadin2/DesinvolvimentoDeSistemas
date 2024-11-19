n1 = int(input("insira o primeiro valor: "))
n2 = int(input("insira o segundo valor: "))

def verificar_numeros():
    if n1 % 2 == 0:
        print("par")
    else:
        print("impar")
    if n2 % 2 == 0:
        print("par")
    else:
        print("impar")

verificar_numeros()
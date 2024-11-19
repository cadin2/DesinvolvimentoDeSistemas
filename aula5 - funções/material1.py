valorTotal = 0

def somarValor(valorProduto):
    global valorTotal
    valorProduto = float(input("PREÇO DO PRODUTO"))
    valorTotal += valorProduto

somarValor(30)
print(f"valor total é´de R$: {valorTotal}")
class Cliente:
    def __init__(self,nome,idade):
        self.nome = nome
        self.idade = idade
        self.saldo = 0
        self.avaliacao = 5
    def addSaldo(self,valor):
        self.saldo += valor
        print(f'O valor de {valor} foi adicionado')

cliente = Cliente('Vitin',21)
cliente.addSaldo(100)
print(cliente.saldo, cliente.avaliacao)
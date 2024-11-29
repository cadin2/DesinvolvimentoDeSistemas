

usuario = {
    # key     value
    "email": "carlos40@gmail.com",
    "senha": "123456890",
    "usuario": "Carlos",
    "vip": True,
    "CPF": 00000000000,
    "endereco": [
            {
                 "cidade": "favelacity"
            }
    ]
}
pesquisa = input("oque voce quer achar: ")
print(usuario[pesquisa])

#METODO PARA DICIONARIO
# len - exibe quantas chaves tem no dicionario
# keys - exibe quais chaves tem no dicionario
# values - retorna os valores
# items - retorna chaves e valores
# get - busca as chaves
# pop - apaga uma chave especifica
# popitem - apaga a ultima chave
# update - atualiza o dicionario
print(len(usuario))
print(list(usuario.keys()))
print(list(usuario.values()))
print(list(usuario.items()))

usuario.setdefault("saldo" , 0)
print(usuario)

print(usuario.get("idade"))

usuario.pop("idade")
print(usuario)

usuario.popitem()
print(usuario)
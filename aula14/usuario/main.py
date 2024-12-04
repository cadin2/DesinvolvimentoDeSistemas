from login import loginUser
from cadastro import cadastroUser

while True:
    opcao = input('voce deseja fazer login ou cadastrar um usuario>>> ')

    if opcao == 'login':
        loginUser()
        break
    if opcao == 'cadastrar':
        cadastroUser()
        break
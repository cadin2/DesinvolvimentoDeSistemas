agenda = {}

while True:
    nome = input('digite o nome do usuario: ')
    tel = input('digite o telefone dele: ')

    agenda.update({
        nome : tel
    })

    print("===========AGENDA DA TIA MONICA================")
    for contatinhos in agenda.items():
        print(f'Nome : {contatinhos[0]} - Tel : {contatinhos[1]}')
    
    sair = input('deseja finalizar: (sim ou nao) ')
    if sair == 'sim':
        break 
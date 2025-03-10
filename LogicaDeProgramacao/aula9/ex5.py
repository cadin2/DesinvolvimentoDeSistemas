tarefas = {'limpar a casa': 'concluida',
           'lavar a louça': 'pendente',
           'arrumar o quarto': 'atrasado',
           }

print(tarefas)
print('1-adicionar tarefa\n2-remover tarefa\n3-marcar tarefa')
add = int(input())

match add:
    case 1:
        nome = input('insira o nome da tarefa: ')
        sair = input('voce desseeja finalizar(s ou n): ')
        while sair == 'n':
            nome = input('insira o nome da tarefa: ')
            sair = input('voce desseeja finalizar(s ou n): ')
            if sair == s:
                break
        for nomes in nome:
            tarefas.update({nome: 'sem marcação'})
        print(tarefas)
    case 2:
        remover = input('insira o nome da tarefa a ser removida: ')
        tarefas.pop({remover})
        print(tarefas)
    case 3:
        nome = input('insira o nome da tarefa:')
        marcacao = input('adicione a marcação (pedente, concluida ou atrasada): ')

        tarefas.update({nome: marcacao})
        print(tarefas)
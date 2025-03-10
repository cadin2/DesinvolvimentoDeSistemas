informacoes = {
    'joao':{
        'idade': '15',
        'nota' : '7'
    },
    'pedro':{
        'idade': '16',
        'nota' : '8'
    }
}

pergunta = input('insira o nome do aluno>>> ')

if pergunta == 'joao':
    print(informacoes['joao'])
elif pergunta == 'pedro':
    print(informacoes['pedro'])
else:
    print('esse nome não existe')
    print('esses sao os alunos disponiveis')
    print(informacoes) 

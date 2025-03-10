import json
usuario ={
    "nome" : "Emilia"
}

with open('dados.json','w', encoding='utf8') as leitura:
    json.dump(
        usuario,
        leitura,
        indent = 2
    ) 
with open('dados.json','r', encoding='utf8') as leitura:
    pessoa = json.load(leitura)
    print(pessoa['nome'])

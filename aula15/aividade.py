# windows - cls
# macOs e Linux - clear
import os

class Motorista:
    def __init__(self,nome):
        self.nome = nome
        self.carro = None
    
    def associarCarro(self,carro):
        self.carro = carro
        print(f'O motorista {motorista.nome} se associou ao carro!')

class Carro:
    def __init__(self,nome):
        self.nome = nome
        self.velocidade = 0
        self.portaMalas = ['Step']

    def acelerar(self,velocidadeAcelerada):
        # limpa terminal
        os.system('cls')
        if velocidadeAcelerada <= 0:
            print('VALOR INVALIDO!')
        else:
            self.velocidade += velocidadeAcelerada
            print(f'Acelerei {velocidadeAcelerada}\n')
            print(f'Velocidade atual: {self.velocidade}')

    def adicionarPortaMalas(self,*items):
        os.system('cls')
        print('PORTA MALAS DO CARRO')

        for item in items:
            self.portaMalas.append(item)

        for numero,item in enumerate(self.portaMalas):
            print(f'🟢 {numero+1} - {item}')

motorista = Motorista('Victor')
c1 = Carro('Lamborguini')

motorista.associarCarro(c1)
motorista.carro.acelerar(100)
motorista.carro.acelerar(50)
motorista.carro.adicionarPortaMalas('Compras','Cooler','Mala')

print(motorista.__dict__)
print(vars(c1))
Algoritmo "Procedimentos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2025
Var
// Seção de Declarações das variáveis 
i: inteiro
m, pesado: caractere
p, mai: real
procedimento Topo()
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
limpatela
escreval("------------------------------------")
escreval("D E T E C T O R DE P E S A D O")
escreval("Maior peso ate agora: ", mai , "kg")
escreval("------------------------------------")
fimprocedimento
inicio
topo()
para i <- 1 ate 5 faca
   escreval("digite o nome: ")
   leia(m)
   escreval("digite o peso de ", m, ": ")
   leia(p)
   se (p>mai) entao
      MAI <- p
      pesado <- m
   fimse
   limpatela
   topo()
fimpara
limpatela
topo()
escreval("A pessoa mais pesada foi ", pesado, ", com", mai, " quilos")
   

Fimalgoritmo
Algoritmo "Procedimentos"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2025
Var
// Se��o de Declara��es das vari�veis 
i: inteiro
m, pesado: caractere
p, mai: real
procedimento Topo()
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
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
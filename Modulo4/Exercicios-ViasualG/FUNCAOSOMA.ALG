Algoritmo "funcaosoma"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 22/04/2025
Var
n1,n2,s: inteiro

funcao soma(x,y: inteiro):inteiro
inicio
retorne x + y
fimfuncao

Inicio
escreva("digite o primeiro numero>> ")
leia(n1)
escreva("digite o segundo numero>> ")
leia(n2)

s<- soma(n1,n2)

escreva(n1," + ",n2," = ", s)

fimalgoritmo
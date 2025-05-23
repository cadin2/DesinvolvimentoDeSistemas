Algoritmo "bhaskara"
Var
delta,x1,x2:real
procedimento Bhas(a,b,c: real)
Inicio
delta <- b^2 - 4 * a * c
x1 <- (-b + raizq(delta)/2*a)
x2 <- (-b - raizq(delta)/2*a)
escreval("o valor de delta é>> ", delta)
escreval("o valor de x1>> ", x1)
escreval("o valor de x2>> ",x2)
fimprocedimento

inicio
bhas(4,5,12)
Fimalgoritmo
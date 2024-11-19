lista = [1, 3, 4, 6, 8]
print(lista, type(lista))
lista.append(10)
print(lista)

#tupla - não mutavel
cord_x = "-999"
cor_y = "-888"
loc = cord_x, cor_y

#então a função loc.apped(2) por exemplo, não se pode usar com tuplas
print(loc, type(loc))
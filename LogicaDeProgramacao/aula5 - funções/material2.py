def soma (x, y ,z = None):
    if z is not None:
        print(f"{x} + {y} + {z} = {x+y+z}")
    else:
        print("Z NÃO É UM NUMERO")

soma(19,2,3)
class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular area utilizando la formula:
    area = bade * altura. pero la base y la altura deben ser ingresados por el
    usuaio y los objetos  debeen ser tres.
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.base * self.altura

a = int(input("por fabor ingrese la altura del rectangulo 1: "))
b = int(input("por fabor ingrese la base del rectangulo 1: "))
rectangulo1 = Rectangulo(a, b)
print(f"el area del rectangulo 1 es: {rectangulo1.calcular_area()}")

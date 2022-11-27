class Persona: 
  contador_personas = 0 # Variable de la clase
  
  def__init__(self, nombre, edad):
    Persona.contador_personas += 1 # Vamos incrementando 
    self.id_persona = Persona.contador_personas
    self.nombre = nombre
    self.edad = edad 
    
  def__str__(self):
      return f'Persona [{self.id_persona} = {self.nombre} {self.edad}]'
    
persona1 = Persona('Leila', 28)
print(persona1)
persona2 = Persona('Pedro', 30) 
print(persona2)
persona3 = Persona('Ana', 26) 
print(persona3)
print(f'Valor contador personas: {Persona.contador_personas}')

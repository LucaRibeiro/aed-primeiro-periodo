maior:float = 0
menor:float = 0

contador:int = 0
contador_mulheres:int = 0
contador_homens:int = 0

soma:float = 0
soma_mulheres:float = 0
soma_homens:float = 0

while True:
    codigo = int(input('Informe o código de sexo(1/2): '))    
    altura = float(input('Informe a altura: '))

    print("------------------------")
    print("Codigo: {}".format(codigo))
    print("Altura: {}".format(altura))
    print('\n')
    
    if altura < 0: 
        break

    soma += altura
    contador += 1

    if altura < menor or contador == 1:
        menor = altura

    if altura > maior or contador == 1:
        maior = altura

    if codigo == 1:
        soma_homens += altura
        contador_homens += 1
    elif codigo == 2:
        soma_mulheres += altura
        contador_mulheres += 1


media:float = soma/contador
media_homens:float = soma_homens/contador_homens
media_mulheres:float = soma_mulheres/contador_mulheres

print("--------Resultados--------")
print("Maior altura: {}".format(maior))
print("Menor altura: {}".format(menor))
print("Média da altura das mulheres: {}".format(media_mulheres))
print("Média da altura dos homens: {}".format(media_homens))
print("Média da altura da turma : {}".format(media))
# criar um loop para gerar iterações e testar alguns parâmetros
# Objetivo: descobrir qual é o último valor para números pares e ímpares do laço

valores = [] # array (list)
x_par = 0
x_impar = 0

for i in range(100):
    if (i %2 == 0): # par
        #print('Par: ', (i * i) )
        #valores.append( (i * i) )
        #x_par = (i * i)

        # insere um valor em uma posição determinada
        valores.insert(0, (i * i))
    else:
        #print('Impar: ', ((i * i)-i) )
        #valores.append((i * i)-i)
        #x_impar = (i * i)-i
        valores.insert(1, (i * i)-1)

print('Par..:', valores[0])
print('Impar:', valores[1])

#print('Par..:', valores[len(valores)-2])
#print('Impar:', valores[len(valores)-1])
#print('Par..:', x_par)
#print('Impar:', x_impar)
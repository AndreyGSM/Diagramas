Algoritmo ContadorPares
    Definir limite, contador Como Entero
    
    Escribir "Ingrese un límite:"
    Leer limite
    
    contador <- 0
    
    Mientras contador <= limite Hacer
        Si contador % 2 = 0 Entonces
            Escribir contador
        FinSi
        contador <- contador + 1
    FinMientras
FinAlgoritmo

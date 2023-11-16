Algoritmo sin_titulo
	Definir m,t,imc Como Real
	Escribir 'digite su m'
	Leer m
	Escribir 'digite su t'
	Leer t
	imc <- m/(t*t)
	Si imc<18.5 Entonces
		Escribir 'insuficiencia'
	SiNo
		Si imc<24.9 Entonces
			Escribir 'normal'
		SiNo
			Si imc<29.9 Entonces
				Escribir 'preobesidad'
			SiNo
				Si imc<34.9 Entonces
					Escribir 'obesidad clase I'
				SiNo
					Si imc<39.9 Entonces
						Escribir 'obesidad clase II'
					SiNo
						Si imc>40.0 Entonces
							Escribir 'DEMASIADO OBESO'
						SiNo
							Escribir 'DEMASIADO OBESO'
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

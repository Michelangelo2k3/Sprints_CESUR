# Pseudocódigo: Inscripción a la Escuela

##  variables 
  -puntos: entero
  -numRegistro: entero
  -hermanoCentro: entero
  -viveMismaPoblacion: entero
  -padresTrabajanMismaPoblacion: entero
  -tieneDiscapacidad: entero
  -esFamiliaNumerosa: entero
  -familiarEscolarizado: entero

## constantes  
  -puntajeHermano = 40: entero
  -puntajeViveMismaPoblacion = 30: entero
  -puntajePadreTrabaja = 20: entero
  -puntajeDiscapacidad = 10: entero
  -puntajeFamiliaNumerosa = 15: entero
  -puntajeFamiliarEscolarizado = 5: entero

## Inicializar
puntos = 0

## Inicio
1. EscriurePantalla("Num. de registre del nen:")
   - Llegir numRegistro

2. EscriurePantalla("Té algun germà al centre (0: no / 1: sí)?:")
   - Llegir hermanoCentro
   - Si hermanoCentro == 1 llavors
     - puntos = puntos + puntajeHermano

3. EscriurePantalla("Viu a la mateixa població que l'escola (0: no / 1: sí)?:")
   - Llegir viveMismaPoblacion
   - Si viveMismaPoblacion == 1 llavors
     - puntos = puntos + puntajeViveMismaPoblacion
   - Sinó
     1. EscriurePantalla("El pare o mare treballa a la mateixa població (0: no / 1: sí)?:")
        - Llegir padresTrabajanMismaPoblacion
        - Si padresTrabajanMismaPoblacion == 1 llavors
          - puntos = puntos + puntajePadreTrabaja

4. EscriurePantalla("Té alguna discapacitat igual o superior al 33% o malaltia crònica (0: no / 1: sí)?:")
   - Llegir tieneDiscapacidad
   - Si tieneDiscapacidad == 1 llavors
     - puntos = puntos + puntajeDiscapacidad

5. EscriurePantalla("Forma part d'una família nombrosa o monoparental (0: no / 1: sí)?:")
   - Llegir esFamiliaNumerosa
   - Si esFamiliaNumerosa == 1 llavors
     - puntos = puntos + puntajeFamiliaNumerosa

6. EscriurePantalla("El pare, mare, tutor legal o germà ha estat escolaritzat a la mateixa escola (0: no / 1: sí)?:")
   - Llegir familiarEscolarizado
   - Si familiarEscolarizado == 1 llavors
     - puntos = puntos + puntajeFamiliarEscolarizado

7. EscriurePantalla("Num. de registre: " + numRegistro + ", Punts totals: " + puntos)

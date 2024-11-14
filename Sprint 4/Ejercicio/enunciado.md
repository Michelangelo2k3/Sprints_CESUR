# Registro de Niño

## var

- numRegistre: entero;
- teGerma, viuZona, pareTreballaZona, discapacitat, familiaNombrosa, exAlumne: entero;
- puntuacio: entero;

## const

- PUNTS_GERMA = 40: entero;
- PUNTS_ZONA = 30: entero;
- PUNTS_TREBALLA_ZONA = 20: entero;
- PUNTS_DISCAPACITAT = 10: entero;
- PUNTS_FAMILIA = 5: entero;
- PUNTS_EXALUMNE = 5: entero;

## fvar

- mostrar("Número de registre del nen:");
- esCorrecte ← esSencer(numRegistre);
- si esCorrecte
  - numRegistre ← llegir sencer;
  - si numRegistre < 1 o numRegistre > 499
    - esCorrecte ← fals;
    - mostrar("Número de registre erroni");
- si no

  - sortir;

- mostrar("Té algun germà al centre (0:no/1:si)?");
- esCorrecte ← esSencer(teGerma);
- si esCorrecte
  - teGerma ← llegir sencer;
  - si teGerma == 1
    - puntuacio ← puntuacio + PUNTS_GERMA;
  - si no
    - si teGerma ≠ 0
      - mostrar("Dada incorrecta");
- si no

  - mostrar("Dada incorrecta");

- mostrar("Viu a la zona de l'escola (0:no/1:si)?");
- esCorrecte ← esSencer(viuZona);
- si esCorrecte
  - viuZona ← llegir sencer;
  - si viuZona == 1
    - puntuacio ← puntuacio + PUNTS_ZONA;
  - si no
    - si viuZona ≠ 0
      - mostrar("Dada incorrecta");
- si no

  - mostrar("Dada incorrecta");

- mostrar("El pare o mare treballen a la zona de l'escola (0:no/1:si)?");
- esCorrecte ← esSencer(pareTreballaZona);
- si esCorrecte
  - pareTreballaZona ← llegir sencer;
  - si pareTreballaZona == 1
    - puntuacio ← puntuacio + PUNTS_TREBALLA_ZONA;
  - si no
    - si pareTreballaZona ≠ 0
      - mostrar("Dada incorrecta");
- si no

  - mostrar("Dada incorrecta");

- mostrar("Té alguna discapacitat o malaltia crònica (0:no/1:si)?");
- esCorrecte ← esSencer(discapacitat);
- si esCorrecte
  - discapacitat ← llegir sencer;
  - si discapacitat == 1
    - puntuacio ← puntuacio + PUNTS_DISCAPACITAT;
  - si no
    - si discapacitat ≠ 0
      - mostrar("Dada incorrecta");
- si no

  - mostrar("Dada incorrecta");

- mostrar("Forma part

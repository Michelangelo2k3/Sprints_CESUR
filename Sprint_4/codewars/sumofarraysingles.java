package codewars;

public class sumofarraysingles {
  public static int repeats(int[] arr) {
    int contador = 0;
    int suma = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j) {
          if (arr[i] == arr[j]) {
            contador++;
          }
        }
      }
      if (contador == 0) {
        suma += arr[i];
      }
      contador = 0;
    }
    return suma;
  }
}

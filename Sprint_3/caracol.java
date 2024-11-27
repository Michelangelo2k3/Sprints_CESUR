

public class caracol {
  public static int snail(int column, int day, int night) {

    int metrossubidos = 0;
    int dias = 0;

    while (metrossubidos != column) {
      dias++;
      metrossubidos = metrossubidos + day;
      if (metrossubidos >= column) {
        return dias;

      }
      metrossubidos = metrossubidos - night;

    }
    return dias;
  }
  public static void main(String[] args) {
      snail(3, 2, 3);
  }
}

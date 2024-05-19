public class Factory implements FactoryIF {
  public TriangleIF createTriangle(float a, float b, float c) {
    if (a <= 0 || b <= 0 || c <= 0) throw new IllegalArgumentException("Los lados no pueden ser negativos o cero");
    if (a == b && a == c) {
      return (TriangleIF) new Equilatero();
    } else if ((a == b && a != c) || (a != b && a == c)) {
      return (TriangleIF) new Isoscel();
    } else {
      return (TriangleIF) new Escaleno();
    }
  }
}

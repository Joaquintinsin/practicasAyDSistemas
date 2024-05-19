public class Ej1 {
  public static void main (String[] args) {
    float a = 1;
    float b = 1;
    float c = 1;
    FactoryIF f = new Factory();
    TriangleIF t = f.createTriangle(a,b,c);
    t.descripcion();
  }
}

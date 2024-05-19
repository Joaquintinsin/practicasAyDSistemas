public  class Filtro1 extends Filtro{
    public Filtro1() {
        super();
    }
    public void execute(Imagen i) {
        System.out.println("Aplicando acciones de filtro 1");
        this.getApi().ilumninar(i);
        this.getApi().colorearBordes(i);
        this.getApi().aplicarBlancoNegro(i);
        System.out.println("------------------------------");
    }
}

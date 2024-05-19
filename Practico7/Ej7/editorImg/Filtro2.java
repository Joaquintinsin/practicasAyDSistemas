public  class Filtro2 extends Filtro{
    public Filtro2() {
        super();
    }
    public void execute(Imagen i) {
        System.out.println("Aplicando acciones de filtro 2");
        this.getApi().suavizarBordes(i);
        this.getApi().quitarOjosRojos(i);
        this.getApi().aplicarSepia(i);
        System.out.println("------------------------------");
    }
}

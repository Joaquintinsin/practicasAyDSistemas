public class EditorImagen {
    private Api api;
    public EditorImagen(Api api) { 
        this.api = api;
    }
    public static void main(String[] args) {
        Api api = new Api();
        //Se crea un Editor de imagenes
        EditorImagen edi = new EditorImagen(api);
        //Se crea una imagen 
        Imagen img = new Imagen("laGioconda");
        //se crea el filtro 1
        Filtro1  f1 = new Filtro1();
        f1.setApi(api);
        //ejecutamos el filtro 1
        //f1.execute(img);
    }
}

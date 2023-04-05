public class Fila {
    private static Fila _instance;
    private Fila(){

    }

    public void ImprimeDocumento(){

    }

    public void RemoveDocumento(){

    }

    public void RemoveTodosDocumentos(){

    }

    public static Fila getInstance(){
        if(_instance == null)
            _instance = new Fila();

        return _instance;
    }
}

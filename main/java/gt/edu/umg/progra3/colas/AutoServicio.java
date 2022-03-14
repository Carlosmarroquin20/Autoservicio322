package gt.edu.umg.progra3.colas;

public class AutoServicio {

    private Cola cola;

    public AutoServicio(Cola cola) {
        this.cola = cola;
    }

    public String ingresarAuto(String placa){
    	cola.enqueue(placa);
        return placa;
    }

    public String proximoAuto(){
    	return cola.peek();
    }

    public String entregarAuto(){
    	return cola.deque();
    }

    public int obtenerAutosEnCola(){
    	return cola.size();
    }
}

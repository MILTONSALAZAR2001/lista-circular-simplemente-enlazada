public class ListaCircular {
    Nodo primero;
    Nodo ultimo;

    public ListaCircular(){
        primero = null;
        ultimo = null;
    }
    public void ingresarNodo (int x){
        Nodo nuevo = new Nodo();
        nuevo.dato = x;

        if(primero == null){
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
    }
    public void desplegarLista(){
        Nodo actual = new Nodo();
        actual = primero;
        do{
            System.out.println(" " + actual.dato);
            actual = actual.siguiente;
        }while(actual != primero);
    }

}

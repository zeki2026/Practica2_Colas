
public class Cola {
    private Nodo head;
    private Nodo[] tail;
    private int size;

    public Cola(int prioridades){
        head = null;
        tail = new Nodo[prioridades];
        size = 0;
    }

    public void add(int val, int prioridad ){
        Nodo nodo = new Nodo(val,prioridad);
        int last;

        
        if(head == null){//si la cola esta vacia 
            head = nodo;//el head sera el nuevo nodo
            tail[prioridad-1] = nodo;//El fin de la cola es el mismo nodo
            size++;
        }else{
            
            if(prioridad == 1){
                add1(nodo);
            }else{
                if(tail[prioridad-1] == null){
                    last = last_Tail(prioridad);//retornar el ultimo nodo de mayor prioridad
    
                    nodo.setnext(tail[last-1].getnext());//Nuevo nodo apunta alnext del nodo de menor prioridad
                    tail[last-1].setnext(nodo);//el utlimo nodo de menor prioridad apunta al nuevo nodo
                    tail[prioridad-1] = nodo;//la cola del ultimo nodo apunta al nuevo nodo
                    
                }else{
                    nodo.setnext(tail[prioridad-1].getnext());
                    tail[prioridad-1].setnext(nodo);
                    tail[prioridad-1] = nodo;
                }
            }
            size++;
        }
    }

    public void add1(Nodo nodo){
        if(tail[0] == null){
            nodo.setnext(head);
            head = nodo;
            tail[0] = nodo;
        }
        else{
            nodo.setnext(tail[0].getnext());
            tail[0].setnext(nodo);
            tail[0] = nodo;
        }
        size++;
    }

    /**
     * retornar la cola de mayor
     * @param prioridad
     * @return
     */
    public int last_Tail(int prioridad){
        int ultimo = 0;
        Nodo acurrate = head;

        while(acurrate != null){
            if(prioridad > acurrate.getprioridad()){
                ultimo = acurrate.getprioridad();
            }
            acurrate = acurrate.getnext();
        }
        return ultimo;
    }

    public int getsize(){
        return size;
    }

    public void imprimir_cola(){
        Nodo acurrate = head;
        int im = 0;

        System.out.print("[");
        while(acurrate != null){
            im = acurrate.getval();
            System.out.print("," + im);
            acurrate = acurrate.getnext();
        }
        System.out.print("]\n");
    }

    public void vaciar_cola(){

        while(head != null){
            head = head.getnext();
            imprimir_cola();
        }
        for(int i = 0; i < tail.length; i++){
            tail[0] = null;
        }
    }
}

public class Nodo {
    private int val;
    private Nodo next;
    private int prioridad;

    public Nodo(){
        this.val = 0;
        this.prioridad = 0;
        this.next  = null;
    }

    public Nodo(int val, int prioridad){
        this.val = val;
        this.prioridad = prioridad;
        this.next  = null;
    }

    public Nodo getnext(){
        return next;
    }

    public void setnext(Nodo next){
        this.next = next;
    }

    public int getprioridad(){
        return prioridad;
    }

    public void setprioridad(int prioridad){
        this.prioridad = prioridad;
    }

    public int getval(){
        return val;
    }

    public void setval(int val){
        this.val = val;
    }
}

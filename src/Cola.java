
public class Cola {

    int tamano;
    Nodo inicio;
    Nodo ultimo;

    public Cola() {
        tamano = 0;
        inicio = null;
        ultimo = null;
    }

    public boolean Vacio() {
        return inicio == null;
    }

    public void Encolar(Persona per) {
        Nodo nuevo = new Nodo(per);
        if (Vacio()) {
            inicio = ultimo = nuevo;
        } else {
            ultimo.sig = nuevo;
        }
        ultimo = nuevo;
        tamano++;
    }

    public String MostrarCola() {
        String cola = "";
        Nodo aux = inicio;
        while (aux != null) {
            cola += aux.persona + "\n";
            aux = aux.sig;
        }
        return cola;
    }

    public void Desacolar() {
        inicio = inicio.sig;
        tamano--;
    }

    public void menoshoras() {
        Cola nueva = new Cola();
        Nodo aux = inicio;
        Nodo aux2 = inicio.sig;
        while (!Vacio() && aux != null) {
            if (aux.persona.horast > aux2.persona.horast) {
                Desacolar();
                aux = aux.sig;

            }
        }
        System.out.println(aux.persona);

    }

    public void mashoras() {
        Cola nueva = new Cola();
        Nodo aux = inicio;
        Nodo aux2 = inicio.sig;
        while (!Vacio() && aux != null) {
            if (aux.persona.horast < aux2.persona.horast) {
                Desacolar();
                aux = aux.sig;
            }
        }
        System.out.println(aux.persona);
    }
}

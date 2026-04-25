import java.util.*;

// Clase que representa un nodo del árbol multicamino
class Nodo {
    String valor;
    List<Nodo> hijos;

    public Nodo(String valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }

    // Agregar hijo
    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }
}

// Clase Árbol Multicamino
class ArbolMulticamino {
    Nodo raiz;

    public ArbolMulticamino(String valorRaiz) {
        raiz = new Nodo(valorRaiz);
    }

    // Recorrido en Preorden (visita nodo, luego hijos)
    public void preorden(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.valor + " ");
        for (Nodo hijo : nodo.hijos) {
            preorden(hijo);
        }
    }

    // Recorrido en Postorden (visita hijos, luego nodo)
    public void postorden(Nodo nodo) {
        if (nodo == null) return;
        for (Nodo hijo : nodo.hijos) {
            postorden(hijo);
        }
        System.out.print(nodo.valor + " ");
    }

    // Recorrido por niveles (BFS)
    public void recorridoPorNiveles() {
        if (raiz == null) return;
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.valor + " ");
            cola.addAll(actual.hijos);
        }
    }

    // Búsqueda de un valor en el árbol
    public boolean buscar(Nodo nodo, String valor) {
        if (nodo == null) return false;
        if (nodo.valor.equals(valor)) return true;
        for (Nodo hijo : nodo.hijos) {
            if (buscar(hijo, valor)) return true;
        }
        return false;
    }
}

// Ejemplo de uso
public class EjemploArbolMulticamino {
    public static void main(String[] args) {
        // Crear árbol con raíz
        ArbolMulticamino arbol = new ArbolMulticamino("A");

        // Crear nodos hijos
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");

        // Agregar hijos a la raíz
        arbol.raiz.agregarHijo(nodoB);
        arbol.raiz.agregarHijo(nodoC);
        arbol.raiz.agregarHijo(nodoD);

        // Agregar hijos a B
        nodoB.agregarHijo(new Nodo("E"));
        nodoB.agregarHijo(new Nodo("F"));

        // Agregar hijos a C
        nodoC.agregarHijo(new Nodo("G"));

        // Agregar hijos a D
        nodoD.agregarHijo(new Nodo("H"));
        nodoD.agregarHijo(new Nodo("I"));
        nodoD.agregarHijo(new Nodo("J"));

        // Mostrar recorridos
        System.out.println("Recorrido Preorden:");
        arbol.preorden(arbol.raiz);

        System.out.println("\nRecorrido Postorden:");
        arbol.postorden(arbol.raiz);

        System.out.println("\nRecorrido por Niveles:");
        arbol.recorridoPorNiveles();

        // Buscar valores
        System.out.println("\n¿Existe el nodo 'G'? " + arbol.buscar(arbol.raiz, "G"));
        System.out.println("¿Existe el nodo 'Z'? " + arbol.buscar(arbol.raiz, "Z"));
    }
}

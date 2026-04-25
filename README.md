
# Árbol Multicamino en Java

Este proyecto implementa una estructura de datos de **Árbol Multicamino** (o Árbol N-ario) en Java. A diferencia de un árbol binario, cada nodo en este tipo de árbol puede tener un número ilimitado de hijos, lo que lo hace ideal para representar jerarquías complejas como sistemas de archivos o estructuras organizacionales.

## Estructura del Árbol

El código de ejemplo en `EjemploArbolMulticamino.java` construye la siguiente jerarquía visual:

```mermaid
graph TD
    A((A)) --> B((B))
    A --> C((C))
    A --> D((D))
    B --> E((E))
    B --> F((F))
    C --> G((G))
    D --> H((H))
    D --> I((I))
    D --> J((J))

    style A fill:#f9f,stroke:#333,stroke-width:2px
```

## Funcionamiento del Código

El sistema se divide en tres componentes principales:
1.  **Clase `Nodo`**: Contiene el valor (`String`) y una lista dinámica (`List<Nodo>`) para almacenar a sus hijos.
2.  **Clase `ArbolMulticamino`**: Gestiona la raíz y contiene los algoritmos de búsqueda y recorrido.
3.  **Algoritmos de Recorrido**:
    * **Preorden**: Raíz → Hijos.
    * **Postorden**: Hijos → Raíz.
    * **Por Niveles (BFS)**: Visita el árbol nivel por nivel usando una cola.

### Diagrama de Flujo: Recorrido Preorden
Este diagrama representa la lógica recursiva utilizada para visitar los nodos:

```mermaid
flowchart TD
    Start([Inicio Preorden]) --> NullCheck{¿Nodo es Nulo?}
    NullCheck -- Sí --> Return([Retornar])
    NullCheck -- No --> Print[Imprimir Valor del Nodo]
    Print --> Loop[Para cada Hijo del Nodo]
    Loop --> Recursive[Llamar Preorden hijo]
    Recursive --> Loop
    Loop -- No hay más hijos --> End([Fin])
```

## Cómo ejecutarlo

1.  Asegúrate de tener instalado el **JDK 8** o superior.
2.  Copia el código en un archivo llamado `EjemploArbolMulticamino.java`.
3.  Compila y ejecuta desde la terminal:

```bash
javac EjemploArbolMulticamino.java
java EjemploArbolMulticamino
```

## Métodos Incluidos

| Método | Descripción |
| :--- | :--- |
| `preorden(Nodo n)` | Recorrido recursivo priorizando la raíz actual. |
| `postorden(Nodo n)` | Recorrido recursivo priorizando los descendientes. |
| `recorridoPorNiveles()` | Implementación iterativa mediante una cola (`Queue`). |
| `buscar(Nodo n, String v)` | Búsqueda booleana exhaustiva en toda la estructura. |

---

## Diagramas de la Aplicación

flowchart TD
    Start([Inicio del Programa]) --> Create[Crear ArbolMulticamino 'A']
    Create --> AddNodes[Agregar Hijos: B, C, D y sus descendientes]
    
    subgraph Recorridos
        direction TB
        BFS[<b>Recorrido por Niveles</b><br/>Usa una Cola/Queue]
        DFS[<b>Preorden / Postorden</b><br/>Usa Recursión]
    end

    AddNodes --> BFS
    BFS --> Search{¿Buscar Valor?}
    
    Search -- "Si (ej. 'G')" --> Found[Retornar Verdadero]
    Search -- "No (ej. 'Z')" --> NotFound[Retornar Falso]
    
    Found --> End([Fin])
    NotFound --> End



flowchart TD
    A[Llamada a buscar: nodo, valor] --> B{¿Nodo es null?}
    B -- Sí --> C[Retornar false]
    B -- No --> D{¿nodo.valor == valor?}
    
    D -- Sí --> E[Retornar true]
    D -- No --> F[Iterar sobre lista de hijos]
    
    F --> G{¿Hay más hijos?}
    G -- Sí --> H[Llamada recursiva: buscar hijo, valor]
    H --> I{¿Retornó true?}
    I -- Sí --> J[Retornar true]
    I -- No --> F
    
    G -- No --> K[Retornar false]

## Lógica de Funcionamiento

El proyecto implementa un árbol donde cada nodo puede tener $n$ cantidad de hijos. A continuación se describe el flujo de búsqueda y los métodos de recorrido:

### Algoritmo de Búsqueda
```mermaid
flowchart TD
    A[Inicio Búsqueda] --> B{¿Nodo nulo?}
    B -- No --> C{¿Es el valor buscado?}
    C -- No --> D[Recorrer lista de hijos]
    D --> E[Llamada recursiva por cada hijo]
    E --> F{¿Se encontró?}
    F -- Sí --> G[Retornar True]
    C -- Sí --> G
    B -- Sí --> H[Retornar False]
    F -- No --> H



### Estructura del Árbol
El árbol multicamino se construye de forma jerárquica:

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

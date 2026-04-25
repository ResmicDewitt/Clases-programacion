# 📊 Diagrama de Flujo - Árbol Multicamino en Java

```mermaid
flowchart TD

    %% Inicio
    A[Inicio main()] --> B[Crear árbol con raíz A]

    %% Construcción del árbol
    B --> C[Agregar hijos B, C, D a A]
    C --> D1[Agregar hijos E y F a B]
    C --> D2[Agregar hijo G a C]
    C --> D3[Agregar hijos H, I, J a D]

    %% Recorridos
    B --> E[Recorrido Preorden]
    B --> F[Recorrido Postorden]
    B --> G[Recorrido por niveles]

    %% Búsqueda
    B --> H[Buscar nodo G]
    B --> I[Buscar nodo Z]

    %% Resultados
    E --> E1[Salida: A B E F C G D H I J]
    F --> F1[Salida: E F B G C H I J D A]
    G --> G1[Salida: A B C D E F G H I J]
    H --> H1[Resultado: true]
    I --> I1[Resultado: false]

    %% Fin
    E1 --> Z[Fin]
    F1 --> Z
    G1 --> Z
    H1 --> Z
    I1 --> Z

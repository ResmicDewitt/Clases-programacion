## Diagramas de la Aplicación

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

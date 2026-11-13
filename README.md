# IA Clásica vs IA Moderna

Proyecto educativo en Java que compara dos enfoques de "inteligencia artificial" con ejemplos mínimos:

- **IA clásica (basada en reglas):** el programador escribe las reglas a mano con `if/else`.
- **IA moderna (basada en datos):** el programa decide a partir de ejemplos, no de reglas fijas.

## Estructura

```
src/main/java/com/bryanstrk/
├── Main.java          # Punto de entrada
├── IAClasica.java     # Recomienda una actividad según clima, temperatura y día
├── Clasificador.java  # Clasifica una temperatura como "Alto" o "Bajo" usando datos de ejemplo
└── Dato.java          # Modelo de un dato: temperatura + etiqueta
```

## Requisitos

- Java 25
- Maven

## Ejecutar

Desde IntelliJ: abre el proyecto y ejecuta `Main`.

Desde terminal:

```bash
git clone https://github.com/BryanStrk/IA_Clasica_IA_Moderna.git
cd IA_Clasica_IA_Moderna
mvn compile
java -cp target/classes com.bryanstrk.Main
```

## Salida

```
Resultado: Bajo
```

## Cómo funciona

### IA clásica (`IAClasica`)

Recibe `clima`, `temperatura` y `esFinDeSemana`, y devuelve una actividad según reglas fijas.
Para cambiar el comportamiento hay que modificar el código.

| Clima   | Temperatura | Fin de semana                    | Entre semana                     |
|---------|-------------|----------------------------------|----------------------------------|
| soleado | > 30        | Ir a la pileta                   | Tomar algo fresco                |
| soleado | 21 – 30     | Salir a pasear                   | Salir a caminar un rato          |
| soleado | ≤ 20        | Abrigarse pero salir igual       | Abrigarse pero salir igual       |
| lluvia  | -           | Ver películas en casa            | Quedarse en casa trabajando      |
| nublado | > 25        | Salir igual, no hace tanto calor | Salir igual, no hace tanto calor |
| nublado | ≤ 25        | Quedarse en casa o salir poco    | Quedarse en casa o salir poco    |
| otro    | -           | No se puede determinar la actividad | No se puede determinar la actividad |

Para probarla, descomenta el `main` de ejemplo en `Main.java`.

### IA moderna (`Clasificador`)

1. Recibe una lista de `Dato` (por ejemplo `10 → Bajo`, `90 → Alto`).
2. Calcula el **promedio** de todas las temperaturas (en el ejemplo: 46).
3. Si la nueva temperatura es mayor o igual al promedio devuelve `Alto`, si no `Bajo`.

Si cambias los datos de entrenamiento, cambia el resultado sin tocar la lógica.


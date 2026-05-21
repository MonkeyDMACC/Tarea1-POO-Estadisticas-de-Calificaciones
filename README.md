# 📊 Reporte de Calificaciones en Java
Miguel Angel Chinchilla Coello cuenta#20181003241
POO sección 1100

## 📝 Descripción del programa
Este programa en Java pide **8 calificaciones** al usuario, valida que estén en el rango correcto (0–100), y genera un **reporte completo** con promedio, nota máxima, mínima, cantidad de aprobados, reprobados y porcentaje de aprobación.  
La idea es que sea sencillo, claro y útil para analizar resultados de un grupo pequeño de estudiantes.

---

## ⚙️ Explicación de cada método
- **`leerNotas()`** → Pide las 8 calificaciones al usuario, valida que sean números y estén en el rango permitido.  
- **`validarNotas()`** → Comprueba que el arreglo de notas sea válido (no nulo y con 8 elementos).  
- **`calcularPromedio()`** → Suma todas las notas y devuelve el promedio.  
- **`encontrarMaximo()`** → Busca la nota más alta.  
- **`encontrarMinimo()`** → Busca la nota más baja.  
- **`contarAprobados()`** → Cuenta cuántos estudiantes tienen nota ≥70.  
- **`mostrarReporte()`** → Genera el reporte final en consola con formato visual.

---

## 🔄 Flujo del programa
1. El usuario ingresa las 8 calificaciones.  
2. Se validan las entradas (solo números entre 0 y 100).  
3. Se calculan estadísticas (promedio, máximo, mínimo, aprobados, reprobados).  
4. Se muestra el reporte en consola con un formato decorativo.  

### 📌 Diagrama de flujo (simplificado)

[Inicio]
↓
[Ingresar 8 notas]
↓
[Validar notas]
↓
¿Notas válidas?
├── No → [ERROR]
└── Sí → [Calcular estadísticas]
↓
[Mostrar reporte]
↓
[Fin]


## 📊 Salida esperada

REPORTE DE CALIFICACIONES

Calificaciones ingresadas:
85 - 92 - 78 - 88 - 95 - 75 - 82 - 90

─── ESTADÍSTICAS ───
Promedio:              86.19
Calificación máxima:   95
Calificación mínima:   75

─── ANÁLISIS DE RESULTADOS ───
Cantidad de aprobados (≥70):   8
Cantidad de reprobados (<70):  0
Porcentaje de aprobados:       100.0%



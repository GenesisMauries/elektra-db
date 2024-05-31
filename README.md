# API Documentation

## Plazos Endpoints

### Crear un nuevo plazo

- **URL:** `/plazos/crear`
- **Método:** `POST`
- **Descripción:** Crea un nuevo plazo y lo guarda en la base de datos.
- **Parámetros de entrada:** Objeto JSON con los datos del plazo.
- **Respuesta exitosa:** `201 Created` con el mensaje "Plazo creado exitosamente".
- **Ejemplo de solicitud:**
    ```json
    {
        "semanas": 10,
        "tasaNormal": 0.05,
        "tasaPuntual": 0.06
    }
    ```

### Obtener todos los plazos

- **URL:** `/plazos/todos`
- **Método:** `GET`
- **Descripción:** Obtiene todos los plazos almacenados en la base de datos.
- **Respuesta exitosa:** Lista de objetos JSON representando los plazos.
- **Ejemplo de respuesta:**
    ```json
    [
        {
            "id": 1,
            "semanas": 8,
            "tasaNormal": 0.04,
            "tasaPuntual": 0.05
        },
        {
            "id": 2,
            "semanas": 12,
            "tasaNormal": 0.06,
            "tasaPuntual": 0.07
        }
    ]
    ```

## Productos Endpoints

### Obtener todos los productos

- **URL:** `/productos`
- **Método:** `GET`
- **Descripción:** Obtiene todos los productos almacenados en la base de datos.
- **Respuesta exitosa:** Lista de objetos JSON representando los productos.
- **Ejemplo de respuesta:**
    ```json
    [
        {
            "id": 1,
            "sku": "SKU123",
            "nombre": "Producto 1",
            "precio": 25.99
        },
        {
            "id": 2,
            "sku": "SKU456",
            "nombre": "Producto 2",
            "precio": 39.99
        }
    ]
    ```

### Obtener un producto por ID

- **URL:** `/productos/{id}`
- **Método:** `GET`
- **Descripción:** Obtiene un producto específico por su ID.
- **Parámetros de entrada:** ID del producto.
- **Respuesta exitosa:** Objeto JSON representando el producto encontrado.
- **Respuesta no encontrada:** `404 Not Found` si el producto no existe.
- **Ejemplo de respuesta exitosa:**
    ```json
    {
        "id": 1,
        "sku": "SKU123",
        "nombre": "Producto 1",
        "precio": 25.99
    }
    ```

### Crear un nuevo producto

- **URL:** `/productos`
- **Método:** `POST`
- **Descripción:** Crea un nuevo producto y lo guarda en la base de datos.
- **Parámetros de entrada:** Objeto JSON con los datos del producto.
- **Respuesta exitosa:** Objeto JSON representando el producto creado.
- **Ejemplo de solicitud:**
    ```json
    {
        "sku": "SKU789",
        "nombre": "Producto 3",
        "precio": 49.99
    }
    ```

### Actualizar un producto existente

- **URL:** `/productos/{id}`
- **Método:** `PUT`
- **Descripción:** Actualiza un producto existente por su ID.
- **Parámetros de entrada:** ID del producto y objeto JSON con los nuevos datos del producto.
- **Respuesta exitosa:** Objeto JSON representando el producto actualizado.
- **Ejemplo de solicitud:**
    ```json
    {
        "sku": "SKU789",
        "nombre": "Producto 3 (Actualizado)",
        "precio": 54.99
    }
    ```

### Eliminar un producto

- **URL:** `/productos/{id}`
- **Método:** `DELETE`
- **Descripción:** Elimina un producto existente por su ID.
- **Parámetros de entrada:** ID del producto a eliminar.
- **Respuesta exitosa:** `204 No Content` si el producto se elimina correctamente.

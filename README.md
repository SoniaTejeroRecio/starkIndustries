# Proyecto starkIndustries_SoniaTejeroRecio

## Comenzamos 🚀
entrar en: 
http://localhost:8080/login

# ¿Cómo he estructurado el proyecto?💡

## starkIndustries\src\main\java\seguridad

- **`AdminController`**: 

- **`ConfiguracionAsync`**
  
- **`ControladorEventos`**
  
- **`EmailService`**

- **`NotificacionesWebSocketController`**

- **`SecurityConfig`**

- **`SeguridadAplicacion`**

- **`SeguridadController`**

- **`Sensor (interface)`**

- **`SensorController`**

- **`SensorDTO`**

- **`SensorMovimiento`**

- **`SensorService`**

- **`SensorTemperatura`**

- **`SensorAsincrono`**

- **`Servicios`**

- **`UserController`**

- **`WebConfig`**

- **`WebSocketConfig`**

## starkIndustries\src\resources\application.properties 💡

## starkIndustries\src\resources\templates 💡

- **`arquitectura.html`**

- **`eventos.html`**
  
- **`index.html`**

- **`login.html`**

- **`rendimiento.html`**


## starkIndustries\src\java\diagrama 💡

- **`Realización de un diagrama de clases con las relaciones del proyecto**

```
Usuarios con roles diferentes:

📌admin con rol ADMIN y contraseña adminpassword.
📌user con rol USER y contraseña userpassword.
Rutas protegidas por roles:

Solo los usuarios con rol ADMIN pueden acceder a /admin.
Tanto los usuarios con rol USER como ADMIN pueden acceder a /user.

Las rutas protegidas están configuradas para permitir o denegar el acceso en función de los roles.

📌Este control de acceso se gestiona en la clase SecurityConfig y se aplica a las rutas especificadas en los controladores.

```
## Corrección 🖇️
_Link a codespace:_ [codespace_de_Sonia](https://codespaces.new/SoniaTejeroRecio/starkIndustries)

_Repositorio de github:_(https://github.com/SoniaTejeroRecio/starkIndustries.git)

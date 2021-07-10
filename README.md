Using Koitlin to create an App.
Incluide:
- Architecture design (img)
- Pseudocode :

1. Show a playlist to the users.
2. You can type a song, it will show the album.
3. Select and play the songs.
4. Stop/Pause the song.
5. Message show up.
6. Back to the playlist.

# Guia

Esta es una pequeña guía para la intreracción práctica del uso y aplicación de Kotlin en una app de música.


## 1. Carga de canciones (Tame Impala / loading playlist 0%).
Para dar inicio debemos cumplir la primera instrucción y escribir el nombre de la banda musical. A continuación la app comienza con la carga del playlist.Inmediatamente veremos como se carga la lista, en este desarrollo podemos ver un ejemplo de lo que son las Corutinas y la suspensión de datos, es parte de la progrmación asíncrona y se utiliza para ayudar a realizar tareas de larga duración.

## 2. Playlist

Una vez terminada la carga de Playlist, muestra una lista de canciones. Aquí utilizamos una colleción de objetos para su desarrollo que en esta caso se conoce como LIST, y que nos ayuda a brindar los nombres de forma ordenada.

## 3. Primer canción (Enter your song, Your choose, The LP).

Te sugerimos escribir el nombre de una canción de la lista, a continuación veramos el nombre y los información de la canción, principalmente a que disco pertenece tu selección. Aquí desarrollamos  programación orientada objetos (clases, objetos, constructores) para mostrar canciones y los álbums relacionamos los atributos del disco (banda, genero, año). Podemos ver un ejemplo de named arguments.

## 4. Reproducir canción.

Aquí solo vemos parte de una variable simple (false, true) para decirle al usuario que puede reproducir o no la canción.

## 5. Reproduciendo canción (1er parte).

Nos indica que la canción esta sonando, y también nos muestra cuantas más canciones hay en la lista por escuchar. Esto es parte de los modificadores de acceso. Le dimos ciertos atributos a la cacnión para asignarles comportamientos o restringirlos, ayudandonos de los constructores.

## 6. Reproduciendo canción (2da parte).

A continuación hay una instrucción, debemos escribir otra canción de la lista, posteriormente la app nos describe el total de canciones, pero también cada que se reproduce una canción se van reduciendo las opciones de canciones por escuchar. Esto es parte del desarrollo de setter, da acceso a una variable, y restringe la forma en la que se puede modificar y cualquier otro paso adicional (There are 13 songs to listen to) y lo que corresponde a Getter cada que se reproduce una canción de la lista no va indicar el número de canciones que quedan en la lista por escuchar, es decir va reduciendo las posibilidades de escuchar canciones al usuario.

## 7. Reproducción de una canción diferente.

Si el usaurio decide escuchar una canción diferente (Play Another Song For Me - Expectation), la app le muestra una nueva opción, posteriormente la app le indicaría la canción en fila (Expectation coming soon! PLAY) y la va a reproducir automaticamente (Expectation PLAYING) para continuar indicando cual es la siguiente canción en la fila (Let It Happen coming soon!). Aquí podemos ver que el tema de Herencia, nos permite crear clases hijos y darles ciertos atributos  (canciones) para que ejecuten las acciones de mostrar una canción y acontinuación otra diferente. Y con la aplicación del polimorfismo diferente funcionalidad, es decir diferentes canciones para mostrarse.

## 8. Comprando boletos para conciertos (Tickets, Number, City).

Esta app tiene la funcionalidad de que el usuario puede comprar boletos para conciertos de la banda. Seguimos las instrucciones (importante poner número de boletos de lo contrario se obtiene error) de llenado y vemos que nos indica los datos del próximo concierto, la ciudad, fecha y la cantidad, en este caso es un ejemplo para 4 boletos y obtenemos el costo total (1000) y el costo unitario (250). Se implemento la programación de Clases Abstractas y poder heredarlas en los eventos de los boletos de compra.

## 9. Adquiriendo descuentos (código de promoción BoGo50%).

Si el usuario desea obtener un descuento para este mismo concierto puede escribir el código de promoción, y obtendrá un descuento del 50% en sus boletos, en este mismo ejemplo obtenemos el costo total (500) y el costo unitario (125). Podemos obtener este resultado gracias a la aplicación de Interfaces en la cual describimos ciertos atributos y la característica única que se necesitaba para aplicar el descuento.

## 10. Boletos para una ciudad diferente (Get tickets for your city).

Si el usuario desea obtener boletos para una ciudad diferente puede escribir y ver cual es el resultado. Obtiene un Sold Out!. Esto también se pudo realizar gracias a las Clases Abstractas.

## 11. Historial de conciertos (Check the last shows?).

Podemos ver el historial de conciertos, en este caso nos muestra dos. Se aplico Data class y Companion object, únicamente para ayudar a cargar información por medio de una clase y constructor, además ayudo a mostrar las propiedades específicas de los conciertos.
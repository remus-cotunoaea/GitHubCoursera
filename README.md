# GitHubCoursera
Android_Tarea1
Para agregar más idiomas, ingresé al "Open Translations Editor", luego de lo cual agregué 4 strings.xml relacionadas con el proyecto.
En cada string.xml específica, ingresamos las palabras "Bienvenido" y "Entrar" de acuerdo con ese idioma.
En el archivo MainActivity.java, para Button usamos el método findViewById (nombre R.id.nombre id en el archivo activity_main.xml).
Luego, utilicé el método setOnClickListener (lambda -> método que muestra el Diálogo de alerta para el cambio de idioma).
En el método que muestra Alert Dialog para idiomas, construí una matriz de cuatro string con los idiomas relacionados.
Dentro de ese metoda, creé un objeto como AlertDialog.Builder.
Despues llame las metodas setTitle(), por "Select Language", y setSingleChoiceItems() donde construi la opción de idioma deseada.
En la carpeta Drawable, haga clic derecho en New / Batch Drawable Importer, donde se selecciona la imagen deseada.
En le carpeta Android, donde se guardó la imagen, haga clic con el botón derecho en New / Create 9-Patch file...
Importante!!!: La imagen de 9-Patch no debe tener el mismo nombre que la imagen original.
En activity_main.xml, set android: background="@drawble/nombre de imagen 9-Patch.
Por landscape o por sw600dp (tablet) selectiona Create layout-land desde Pantalla Design
Es posible que el proyecto no functiona con un API 23, o menos.

## TextDrawable 

Fork of the TextDrawable library originally found [here](https://github.com/amulyakhare/TextDrawable).
It has been reworked to be more simplified as well as had several features.

### Features
- Oval, Rectangle, and Rounded Rectangle shapes
- Icon support
- Highly customizable (border color, border thickness, type face, text size, text color, and much more)
- Ability to create a Bitmap object from the Drawable
- Kotlin support
- Builder pattern for Java 

### Using TextDrawable
To use TextDrawable, simply create an object with the desired parameters. Each value has a default value, so you can supply as many or as few as you want by using kotlins [named arguements](https://www.programiz.com/kotlin-programming/default-named-arguments). At a minimum, a `text` or an `icon` should be specified.
```kotlin
val textDrawable = TextDrawable(shape = TextDrawable.DRAWABLE_SHAPE_OVAL,
                desiredHeight = 250,
                desiredWidth = 250,
                color = Color.BLUE,
                textColor = Color.RED,
                text = "A")
```

If using java, you can use the [TextDrawableBuilder](https://github.com/Kennyc1012/TextDrawable/blob/master/library/src/main/java/com/kennyc/textdrawable/TextDrawableBuilder.kt) class which used the Builder pattern for easy creation.
```java
TextDrawable drawable = new TextDrawableBuilder(TextDrawable.DRAWABLE_SHAPE_OVAL)
                .setHeight(250)
                .setWidth(250)
                .setColor(Color.BLUE)
                .setTextColor(Color.RED)
                .setText("A")
                .build()
```

### Customizable fields
You can customize the follow attributes of a TextDrawable to fit your needs. Each value has a default value.
```kotlin
// The Shape the drawable should take
        @DrawableShape val shape: Int = TextDrawable.DRAWABLE_SHAPE_RECT,
        // The solid fill color of the drawable
        @ColorInt var color: Int = Color.GRAY,
        // The color of the text for the drawable. Will be ignored if an icon is set
        @ColorInt var textColor: Int = Color.WHITE,
        // The corner radius for the drawable. Will be ignored if the shape is not a DRAWABLE_SHAPE_ROUND_RECT
        var cornerRadius: Float = 0F,
        // The text size for the text of the drawable. Will be ignored if an icon is set
        var textSize: Float = 0f,
        // The desired height of the drawable
        var desiredHeight: Int = -1,
        // The desired width of the drawable
        var desiredWidth: Int = -1,
        // The border thickness of the drawable
        var borderThickness: Float = 0F,
        // The color of the border. Will be ignored if borderThickness is <= 0
        @ColorInt var borderColor: Int = color,
        // The typeface to use for the text of the drawable. Will be ignored if an icon is set
        var typeFace: Typeface = Typeface.DEFAULT,
        // The text to use for the drawable. Will be ignored if an icon is set
        var text: String? = null,
        // The icon to use for the drawable. Will override any text that may have been set
        var icon: Bitmap? = null
```
### Including in your project
Add repository 
```groovy
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
Add dependency
```groovy
dependencies {
    implementation 'com.github.Kennyc1012:TextDrawable:2.0.1'
}
```

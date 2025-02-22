import java.awt.Color
import java.awt.MouseInfo
import java.awt.Robot

fun getMouseColor(): Color {
    val location = MouseInfo.getPointerInfo().getLocation()
    return getColorAt(location.x, location.y)
}

fun getColorAt(x: Int, y: Int): Color {
    return Robot().getPixelColor(x, y)
}
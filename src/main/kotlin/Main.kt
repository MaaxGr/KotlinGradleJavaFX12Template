import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.stage.Stage

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}

class Main : Application() {

    override fun start(primaryStage: Stage) {
        val layout = BorderPane()
        layout.center = TextField("Hello World")

        val scene = Scene(layout, 1600.0, 900.0)
        primaryStage.scene = scene
        primaryStage.title = "Hello World"
        primaryStage.show()
    }

}
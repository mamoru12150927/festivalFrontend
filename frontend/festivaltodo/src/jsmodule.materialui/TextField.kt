// JSモジュールをインポート
@file:JsModule("@material-ui/core/TextField")

package jsmodule.materialui

import org.w3c.dom.events.Event
import react.*

@JsName("default")

external val TextField: RClass<TextFieldProps>

external interface TextFieldProps : RProps {
    var value: String
    var label: String
    var onChange: (e: Event) -> Unit
    var className:String
}
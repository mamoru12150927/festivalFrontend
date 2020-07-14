@file:JsModule("@material-ui/core/Button")

package jsmodule.materialui

import react.RClass
import react.RProps

@JsName("default")

external val Button: RClass<ButtonProps>

external interface ButtonProps : RProps {
    var onClick: () -> Unit
    var disabled: Boolean
    var className:String
}

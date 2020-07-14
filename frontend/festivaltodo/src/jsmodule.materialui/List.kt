@file:JsModule("@material-ui/core/List")
package jsmodule.materialui

import react.RClass
import react.RProps

@JsName("default")

external val MList: RClass<ListProps>

external interface ListProps : RProps {
    var className:String
}
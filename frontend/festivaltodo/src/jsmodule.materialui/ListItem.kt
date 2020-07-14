@file:JsModule("@material-ui/core/ListItem")

package jsmodule.materialui

import react.RClass
import react.RProps

@JsName("default")

external val MListItem: RClass<ListItemProps>

external interface ListItemProps : RProps {
    var alignItems: String?
    var button: Boolean?
    var ContainerComponent: dynamic
    var ContainerProps: RProps?
    var dense: Boolean?
    var disabled: Boolean?
    var disableGutters: Boolean?
    var divider: Boolean?
    var selected: Boolean?
    var className:String
}

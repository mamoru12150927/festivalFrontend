// JSモジュールをインポート
@file:JsModule("@material-ui/core/ListItemText")

package jsmodule.materialui

import react.RClass
import react.RProps
import react.ReactElement

@JsName("default")
external val MListItemText: RClass<ListItemTextProps>

// 必要なpropsを指定
external interface ListItemTextProps : RProps {
    var disableTypography: Boolean?
    var inset: Boolean?
    var primary: ReactElement?
    var primaryTypographyProps: RProps?
    var secondary: ReactElement?
    var secondaryTypographyProps: RProps?
    var theme: Any?
}
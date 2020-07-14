package app

import org.w3c.dom.HTMLInputElement
import react.dom.div
import react.dom.h1
import react.dom.p
import react.*

import jsmodule.materialui.AppBar
import jsmodule.materialui.TextField
import jsmodule.materialui.Button
import jsmodule.materialui.MList
import jsmodule.materialui.MListItem
import jsmodule.materialui.MListItemText

interface Props: RProps {
    var initialItems: List<String?>
}

interface State: RState {
    var items: List<String?>
    var text: String
}

class App(props: Props) : RComponent<Props, State>(props) {
    override fun State.init(props: Props) {
        items = props.initialItems
        text = ""
    }

    override fun RBuilder.render() {
        AppBar {
            h1 {
                +"TodoList"
            }
            attrs.className="bg-dark text-center"
        }

        div("App-center"){
            TextField {
                attrs {
                    value = state.text
                    label = "Add Task"
                    onChange = {
                        val target = it.target as HTMLInputElement
                        setState {
                            text = target.value
                        }
                    }
                }
            }
            Button {
                +"Add"
                attrs {
                    onClick = {
                        if (state.text.isNotEmpty()) {
                            setState {
                                items += text
                                text = ""
                            }
                        }
                    }
                    disabled = state.text.isEmpty()
                    className="btn-dark"
                }
            }
        }
        div("center-block"){
            MList {
                for ((i, item) in state.items.withIndex()) {
                    MListItem {
                        key = i.toString()
                        MListItemText {
                            attrs {
                                primary = p("text-center") {
                                    +item.toString()
                                }
                            }
                        }

                        Button {
                            +"delete"
                            attrs {
                                onClick = {
                                    setState {
                                        items = items.filterIndexed { i, _ -> i != i }
                                    }
                                }
                                className="btn-dark"
                            }
                        }
                    }
                }
            }
        }
        }
    }

fun RBuilder.app(items:List<String?> = kotlin.collections.mutableListOf()) = child(App::class) {
    attrs.initialItems = items
}
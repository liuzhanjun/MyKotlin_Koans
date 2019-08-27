import java.util.ArrayList

open class Tag(val name: String) {
    val children: MutableList<Tag> = ArrayList()
    val attributes: MutableList<Attribute> = ArrayList()

    override fun toString(): String {
        return "<$name" +
            (if (attributes.isEmpty()) "" else attributes.joinToString(separator = "", prefix = " ")) + ">" +
            (if (children.isEmpty()) "" else children.joinToString(separator = "")) +
            "</$name>"
    }
}

class Attribute(val name : String, val value : String) {
    override fun toString() = """$name="$value" """
}
//为节点设置属性
fun <T: Tag> T.set(name: String, value: String?): T {
    if (value != null) {
        attributes.add(Attribute(name, value))
    }
    return this
}

//添加子节点
fun <T: Tag> Tag.doInit(tag: T, init: T.() -> Unit): T {
    tag.init()
    children.add(tag)
    return tag
}

class Html: Tag("html")
class Table: Tag("table")
class Center: Tag("center")
class TR: Tag("tr")
class TD: Tag("td")
class Text(val text: String): Tag("b") {
    override fun toString() = text
}
//实例化html节点
fun html(init: Html.() -> Unit): Html = Html().apply(init)
//为html节点添加table子节点
fun Html.table(init : Table.() -> Unit) = doInit(Table(), init)
//为html节点添加center子节点
fun Html.center(init : Center.() -> Unit) = doInit(Center(), init)
//为table节点添加tr子节点
fun Table.tr(color: String? = null, init : TR.() -> Unit) = doInit(TR(), init).set("bgcolor", color)
//为tr节点添加td子节点
fun TR.td(color: String? = null, align : String = "left", init : TD.() -> Unit) = doInit(TD(), init).set("align", align).set("bgcolor", color)
//为节点添加text节点
fun Tag.text(s : Any?) = doInit(Text(s.toString()), {})


package Export

class XmlExport: FormatExport{
    override fun formatExport(objectToExport: Exportable): String {
        val sb = StringBuilder()
        sb.append("<map name=\"exported element\">\n")
        for ((key, value) in objectToExport.export()) {
            sb.append("  <element key=\"$key\" value=\"$value\"/>\n")
        }
        sb.append("</map>")
        return sb.toString()
    }
}

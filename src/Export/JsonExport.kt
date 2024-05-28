package Export

class JsonExport: FormatExport {
    override fun formatExport(objectToExport: Exportable):String {
        return objectToExport.export().toString()
    }
}
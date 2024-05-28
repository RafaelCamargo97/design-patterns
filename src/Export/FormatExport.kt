package Export

interface FormatExport {
    fun formatExport(objectToExport: Exportable): String
}
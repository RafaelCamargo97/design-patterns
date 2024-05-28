package Item

class Item: Cloneable {
    var value:Double = 0.0
    var isImported:Boolean = true
    var isIndustrialized:Boolean = true
    var onSaleDiscountApplied:Boolean = false
    var customized:Boolean = false
    var details:String = ""

    public override fun clone(): Item {
        return super.clone() as Item
    }
}
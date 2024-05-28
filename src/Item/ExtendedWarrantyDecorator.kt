package Item

class ExtendedWarrantyDecorator(var item: Item): ItemDecorator {
    override fun updateValue() {
        item.value *= 1.08
    }

    override fun updateDetails() {
        item.details += "Item provided with extended warranty. "
    }
}
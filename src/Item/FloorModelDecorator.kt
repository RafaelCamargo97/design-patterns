package Item

class FloorModelDecorator(var item: Item): ItemDecorator {
    override fun updateValue() {
        item.value *= 0.90
    }

    override fun updateDetails() {
        item.details += "This item is a floor model, so it has been granted a 10% discount on its value. "
    }
}
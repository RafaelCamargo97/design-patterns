package Item

class InsuranceDecorator(var item: Item):ItemDecorator {
    override fun updateValue(){
        item.value *= 1.1
    }
    override fun updateDetails(){
        item.details += "Item provided with insurance. "
    }
}
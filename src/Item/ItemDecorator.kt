package Item

interface ItemDecorator {
    fun updateValue()
    fun updateDetails()
    fun add(){
        updateValue()
        updateDetails()
    }
}
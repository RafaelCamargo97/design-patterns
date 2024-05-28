package Command

import Item.Item

class CustomizeCommand: ItemCommand {
    override fun execute(item: Item) {
        if(!item.customized){
            item.customized = true
        }
    }

    override fun unexecute(item: Item) {
        if(item.customized){
            item.customized = false
        }
    }
}
package Command

import Item.Item

interface ItemCommand {
    fun execute(item: Item)
    fun unexecute(item: Item)
}
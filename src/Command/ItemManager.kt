package Command

import Item.Item

class ItemManager {
    private val commands: MutableList<ItemCommand> = mutableListOf()

    fun addCommand(command: ItemCommand){
        commands.add(command)
    }

    fun executeCommands(item: Item){
        for(command in commands){
           command.execute(item)
        }
    }

    fun unexecuteCommands(item: Item){
        for(i in commands.size-1 downTo 0){
            commands[i].unexecute(item)
        }
    }
}
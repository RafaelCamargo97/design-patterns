package Log

class Logger private constructor(){

    companion object{
        private val instance: Logger = Logger()
        private val events: MutableList<Map<String,String>> = mutableListOf()

        fun getInstance(): Logger{
            return instance
        }
    }

    fun addEvents(event: Map<String,String>){
        events.add(event)
    }

    fun getEvents(): MutableList<Map<String,String>>{
        return events
    }
}
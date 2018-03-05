
class Car constructor(fuelTank: Int, numCylinders: Int, condition: Int){

    var engine = Engine(numCylinders,condition)
    var fuel = FuelTank(fuelTank,condition)
    var parts = mutableListOf(engine, fuel)
    fun run(){
        println("vroom")
        for(i in parts.indices){
            parts[i].function()
            parts[i].status()
            println("/////////////////")
        }
        engine.lowerCondition()
        fuel.lowerCondition()
    }
}
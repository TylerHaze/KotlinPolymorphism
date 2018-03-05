class Car constructor(fuelTank: Int, numCylinders: Int, condition: Int){

    var engine = Engine(numCylinders,condition)
    var fuel = FuelTank(fuelTank,condition)
    private val parts : ArrayList<CarPart> = arrayListOf(engine, fuel)


    fun run(){
        println("vroom")
        for(i in parts.indices){
            parts.get(i).function()
            parts.get(i).status()
            println("/////////////////")
        }
    }


}
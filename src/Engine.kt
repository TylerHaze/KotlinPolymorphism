class Engine constructor(numCylinders: Int, condition: Int): CarPart (condition)
{
    var numCylinders = numCylinders;

    override fun function(){
        println("\nThis engine has ${numCylinders} cylinders.")
    }

    open override fun status() {
        println("\nThis engine is at ${condition} health.")
    }


}
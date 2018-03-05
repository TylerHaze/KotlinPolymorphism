abstract class CarPart constructor(condition: Int): Functional{

    var condition = condition;

    fun lowerCondition(){
        condition -= 5
    }

    abstract fun status()
}
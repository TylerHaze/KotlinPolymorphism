class FuelTank constructor(capacity: Int, condition: Int) : CarPart(condition)
{
    var capacity = capacity

    override fun function() {
        println("\nMy capacity is: ${capacity}mpg.")
    }
    override fun status() {
            println("\nI'm a healthy fuel tank. I have $condition health.")
    }
}
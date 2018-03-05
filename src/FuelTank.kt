class FuelTank constructor(capacity: Int, condition: Int) : CarPart(capacity)
{
    var capacity = capacity
    override fun function() {
        println("\nMy capacity is: ${capacity}.")
    }

    open override fun status() {
        println("\nI'm a salvaged fuel tank. I only have ${condition} health.")
    }
}
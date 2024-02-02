class Operation(
    private val n1: Double,
    private val n2: Double,
    private val operationType: String,
    private val result: Double
) {

    fun getFullOperation(): String {
        return "$n1 $operationType $n2 = $result"
    }
}
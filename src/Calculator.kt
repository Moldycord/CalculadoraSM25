class Calculator {

    private val printer = Printer()

    private val dataReader = DataReader()

    private val resultList = mutableListOf<Double>()
    private val memoryResultList = mutableListOf<Operation>()

    private var firstNumber: Int = 0
    private var secondNumber: Int = 0

    fun showMenu() {
        printer.printMessage("Bienvenido a la calculadora simple")
        printer.printMessage("Seleccione una operación")
        printer.printMessage("1 - Suma")
        printer.printMessage("2 - Resta")
        printer.printMessage("3 - Multiplicacion")
        printer.printMessage("4 - Division")
        printer.printMessage("5 - Mostrar operaciones previas")

        val selectedOption = dataReader.readInt()

        when (selectedOption) {
            1 -> {
                readInputs()
                addition(firstNumber, secondNumber)
                showMenu()
            }

            2 -> {
                readInputs()
                subtraction(firstNumber, secondNumber)
                showMenu()
            }

            3 -> {
                readInputs()
                multiplication(firstNumber, secondNumber)
                showMenu()
            }

            4 -> {
                readInputs()
                division(firstNumber, secondNumber)
                showMenu()
            }

            5 -> {
                showResults()
                showMenu()
            }

            else -> {
                printer.printMessage("Opción no disponible")
                showMenu()
            }

        }

    }

    private fun addition(n1: Int, n2: Int) {
        val additionResult = n1 + n2
        println("El resultado de la suma es :$additionResult")
        resultList.add(additionResult.toDouble())
        val sumOperation = Operation(
            n1.toDouble(), n2.toDouble(), "+", additionResult.toDouble()
        )
        memoryResultList.add(sumOperation)
    }

    private fun subtraction(n1: Int, n2: Int) {
        val additionResult = n1 - n2
        println("El resultado de la resta es :$additionResult")
        val sumOperation = Operation(
            n1.toDouble(), n2.toDouble(), "-", additionResult.toDouble()
        )
        memoryResultList.add(sumOperation)
    }

    private fun multiplication(n1: Int, n2: Int) {
        val additionResult = n1 * n2
        println("El resultado de la multiplicación es :$additionResult")
        val sumOperation = Operation(
            n1.toDouble(), n2.toDouble(), "*", additionResult.toDouble()
        )
        memoryResultList.add(sumOperation)
    }

    private fun division(n1: Int, n2: Int) {
        val additionResult = n1 / n2
        println("El resultado de la división es :$additionResult")
        val sumOperation = Operation(
            n1.toDouble(), n2.toDouble(), "/", additionResult.toDouble()
        )
        memoryResultList.add(sumOperation)
    }

    private fun showResults() {
        if (memoryResultList.isEmpty()) {
            println("Seleccione una operacion")
        } else {
            for (result in memoryResultList) {
                println(result.getFullOperation())
            }
        }

    }

    private fun readInputs() {
        printer.printMessage("Ingresa el primer número")
        firstNumber = dataReader.readInt()
        printer.printMessage("Ingresa el segundo número")
        secondNumber = dataReader.readInt()
    }

}


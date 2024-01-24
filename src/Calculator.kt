class Calculator {

    private val printer = Printer()

    private val dataReader = DataReader()

    private var firstNumber: Int = 0
    private var secondNumber: Int = 0



    fun showMenu() {
        printer.printMessage("Bienvenido a la calculadora simple")
        printer.printMessage("Seleccione una operación")
        printer.printMessage("1 - Suma")
        printer.printMessage("2 - Resta")
        printer.printMessage("3 - Multiplicacion")
        printer.printMessage("4 - Division")

        val selectedOption = dataReader.readInt()
        /*  if (selectedOption == 1) {

          } else if (selectedOption == 2) {

          } else if (selectedOption == 3) {


          } else if (selectedOption == 4) {


          } else {

          } */

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

            else -> {
                printer.printMessage("Opción no disponible")
                showMenu()
            }

        }

    }

    private fun addition(n1: Int, n2: Int) {
        val additionResult = n1 + n2
        println("El resultado de la suma es :$additionResult")
    }

    private fun subtraction(n1: Int, n2: Int) {
        val additionResult = n1 - n2
        println("El resultado de la resta es :$additionResult")
    }

    private fun multiplication(n1: Int, n2: Int) {
        val additionResult = n1 * n2
        println("El resultado de la multiplicación es :$additionResult")
    }

    private fun division(n1: Int, n2: Int) {
        val additionResult = n1 / n2
        println("El resultado de la división es :$additionResult")
    }

    private fun readInputs() {
        printer.printMessage("Ingresa el primer número")
        firstNumber = dataReader.readInt()
        printer.printMessage("Ingresa el segundo número")
        secondNumber = dataReader.readInt()
    }

}


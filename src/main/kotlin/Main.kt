// Основная идея здесь заключается в том, что мы принимаем в функцию main
// так называемые command-line arguments.
// Т.е. пользователь не вводит команды в консоль, а вводит их в программу напрямую через командную строку.
// Гарантированный ввод: decryption; the arguments are: -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec
// Получается 3 аргумента:
// -key == 5
// -data == \jqhtrj%yt%m~ujwxpnqq&
// -mode == dec
// Мы принимаем каждый аргумент через соответствующую перtменную, а значение этого аргумента -
// это следующая за аргументом строка.
// Затем уже выполняются остальные части программы, которая нацелена на дешифровку или расшифровку
// введённого текста на основании ключа.
// Также для такого типа аргументов важно, чтобы fun main содержала аргументы, как в примере.
// Откинуть args нельзя.

package encryptdecrypt

fun main(args: Array<String>) {

    val currentMode = args[args.indexOf("-mode") + 1]
    val data = args[args.indexOf("-data") + 1]
    val getKey = args[args.indexOf("-key") + 1]

    val keyInt = getKey.toInt()

    fun encryption() {
        for (i in data) {
            print(i + keyInt)
        }
        println()
    }

    fun decryption() {
        for (i in data) {
            print(i - keyInt)
        }
        println()
    }

    if (currentMode == "enc") {
        encryption()
    } else {
        decryption()
    }

}
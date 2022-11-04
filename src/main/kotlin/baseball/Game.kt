package baseball

import camp.nextstep.edu.missionutils.Console

object Game {
    var input = ""
    fun gameStart(){
        Computer.getCorrectRandomNumber()
        while(true){
            input = Console.readLine()
        }
    }

    private fun checkInputValueIsNumber(inputValue : String) : Boolean{
        var checkFlag = false
        inputValue.forEach {
            if(it.code in 49..57){
                checkFlag = true
            }
        }
        return checkFlag
    }
}
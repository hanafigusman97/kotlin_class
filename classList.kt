data class Student(val name : String, val age: Int, val semester : Int, val university: String) {

}

data class footBallPlayer(val name: String, var age : Int, val club: String, val jersey_num: Int){

    companion object{
        fun seeAge(cName: String, cAge: Int, cClub: String, cJersey_num: Int): footBallPlayer{
            var cAge = cAge
            if (cAge > 30){
                cAge = 40 - cAge
            }
            return footBallPlayer(cName, cAge, cClub, cJersey_num)
        }

    }

}

data class projectData(val name : String, var duration : Double, val User: String, val deadline: Int){
    companion object{
        fun durationLimit(cName: String, cDuration: Double, cUser : String, cDeadline : Int): projectData{
            cDuration/10000
            return projectData(cName, cDuration, cUser, cDeadline)
        }
    }

}

data class peopleNearby(var name: String, var length: Int, var gadget: String, var nearbyStatus: String){
    companion object{
        fun nearbyStatus(cName: String, cLength: Int, cGadget: String, cNearbyStatus : String ): peopleNearby{
            var cLength = cLength
            var cNearbyStatus = cNearbyStatus
            if (cLength < 30000){
                cNearbyStatus = "DEKAT"
            }else{
                cNearbyStatus = "JAUH"
            }
            return peopleNearby(cName, cLength, cGadget, cNearbyStatus)
        }
    }
}



data class StudentClass (var name : String, var age: Int, val semester : Int){

    companion object {
        fun editSemester(cName: String,cAge : Int, cSemester: Int): StudentClass{
            var cSemester = cSemester/2
            return StudentClass (cName, cAge, cSemester)
        }
    }
}




data class StudentWithID(val ID : Int,var name : String, var age: Int, val semester : Int) {

    companion object{
        var idData = 0

        fun createStudent(cName : String, cAge: Int, cSemester : Int): StudentWithID{
            idData = idData + 1

            return StudentWithID (idData, cName,cAge, cSemester)
        }

        fun changeStudentName(cName : String, cAge: Int, cSemester : Int): StudentWithID{

            var cName: String =  "${cName} + telkom"
            return StudentWithID(idData, cName, cAge, cSemester)
        }
    }
}


class studentClass (val name : String, var age : Int, var semester : Int, var univ : String){

    var univChange : String
        get(){
            return univ
        }
        set(value) {

            univ = univ
        }

    var plusSemester: Int
        get(){
            return semester
        }
        set(value){
            semester = semester + value
        }

}

class playerAbility(val name : String, var age : Int, var atk : Int, var def : Int){

    var playerPower : Int
        get() {
            return atk * def
        }
        set(value){
            atk = atk + value
            def = def + value
        }

    var playerDamage : Int
        get () {
            return atk * def
        }
        set(value) {
            atk = atk - value
            def = def - value

        }

}

class employeeClass(val name : String, var age : Int, var position : String, var salary : Int){

    var bonusSalaryManager: Int
        get() {
            return salary
        }
        set(Value){

            salary = salary + 25000000
        }

    var PenaltyManager: Int
        get() {
            return salary
        }
        set(Value){

            salary = (salary/age) - 5000000
        }

}

class stockType (val name : String, var stock : Int, var price : Int){


    var plusStock: Int
        get() {
            return stock
        }
        set(value) {
            stock = stock + 1
        }

    var minusStock: Int
        get() {
            return stock
        }
        set(value) {
            stock = stock - 1
        }


    fun databaseStockreturn (companyList : companyList) : String{
        return "stock of ${companyList.Name} is ${this.stock} and price ${this.price}"
    }

}


class companyList (val Name : String)


class peopleList (val name : String, var age : Int){

    companion object{

        fun outputNamePeople(cName : String): String{
            return "my name is ${cName}"
        }
    }
}

object squareFormula{

    fun squareFunction(Long : Int) : Int{
        return Long * Long * Long
    }
}


object stockReturn {

    fun formulaOfStock(stock : Int): Int{
        return (stock/100) * 100
    }
}

object damageReturn {

    fun superDamage(health : Int): Int{
        return (health) * 100
    }
}


fun peopleList.ageClassifiy(): String{
    if (age > 30) {
        return "cluster x"
    } else {
        return "cluster y"
    }
}

fun stockType.priceClassify() : String{
    if (price > 500.000){

        return "High Class"

    }else if (price > 100.000 && price < 500.000){
        return "middle Class"
    }else{
        return "normal class"
    }

}


fun studentClass.formulaGrade():String {
    if (semester >8){
        return "mahasiswa akhir"
    } else if (semester > 5 && semester < 8){
        return "mahasiswa tengah"
    }else{
        return "maba"
    }
}


fun peopleList.Companion.outputAge(cName :String , cAge : String) :String{

    return "$cName dengan umur $cAge"
}
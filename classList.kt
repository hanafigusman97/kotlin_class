data class Student(val name : String, val age: Int, val semester : Int, val university: String) {

}

data class footBallPlayer(val name: String, val age : Int, val club: String, val jersey_num: Int){

}

data class projectData(val name : String, var duration : Double, val User: String, val deadline: Int){
    var count_duration = duration/30

}

data class peopleNearby(var name: String, var length: Int, var gadget: String){

}


data class StudentWithID(val ID : Int,var name : String, var age: Int, val semester : Int) {

    companion object{
        var idData = 0

        fun createStudent(cName : String, cAge: Int, cSemester : Int): StudentWithID{
            idData = idData + 1

            return StudentWithID (idData, cName,cAge, cSemester)
        }

        fun changeStudentName(cName : String, cAge: Int, cSemester : Int): StudentWithID{

            var cName: String =  "${cName} + telyu"
            return StudentWithID(idData, cName, cAge, cSemester)
        }
    }
}
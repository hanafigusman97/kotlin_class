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
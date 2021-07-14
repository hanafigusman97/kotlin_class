object studentDetail {

    val STUDENTS_UNIVERSITY: String = "telkom university" // value tetap di objek

    var allStudent = mutableListOf<Student>()

    fun addStudent(student: Student){
        allStudent.add(student)
    }

    fun deleteStudent(student: Student){
        allStudent.remove(student)
    }

    fun printAllAnimal(){
        allStudent.forEach(){
            println(it)
        }
    }

}

object footballDetail {

    var footballList = mutableListOf<footBallPlayer>()

    fun addName(footBallPlayer: footBallPlayer) {
        footballList.add(footBallPlayer) //variabel yang isinya input dari class
    }

    fun deleteName(footBallPlayer: footBallPlayer) {
        footballList.remove(footBallPlayer)
    }

    fun printAllPlayer() {
        footballList.forEach() {
            println(it)
        }
    }

}


object projectsDetail {

        var projectsList = mutableListOf<projectData>()

        fun addName(projectData: projectData) {
            projectsList.add(projectData) //variabel yang isinya input dari class
        }

        fun deleteName(projectData: projectData) {
            projectsList.remove(projectData)
        }

        fun printAllProjects() {
            projectsList.forEach() {
                print(it)
            }
        }
}

object peopleNearbyDetail {

    var peopleList = mutableListOf<peopleNearby>()

    fun addName(peopleNearby: peopleNearby) {
        peopleList.add(peopleNearby) //variabel yang isinya input dari class
    }

    fun deleteName(peopleNearby: peopleNearby) {
        peopleList.remove(peopleNearby)
    }

    fun printAllProjects() {
        peopleList.forEach() {
            print(it)
        }
    }

    fun removeAllPeople(){
        peopleList.removeAll(peopleList)
    }
}





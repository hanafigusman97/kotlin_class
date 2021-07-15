
fun main(args: Array<String>) {

    //section 4
    val myName: String = "Hanafi A Gusman"
    println(myName)

    var firstNumber: Int = 5
    var SecondNumber: Int = 5
    println((firstNumber + SecondNumber)/2) // average without list

    firstNumber += 2
    firstNumber -= 10
    firstNumber *= 9
    firstNumber /= 4
    firstNumber %= 3
    firstNumber += 1
    firstNumber *= 2
    firstNumber %= 4
    println(firstNumber)
//----------------------------------------------------------------
    //section 5
    var first = 1.Double()
    var second = 2.toDouble()
    var hird = 3.toDouble()
    var fourth = 4.toDouble()
    var fifth = 5.toDouble()
    var sixth = 6.toDouble()
    var seven = 7.toDouble()
    var eight = 8.toDouble()
    var ninth = 9.toDouble()
    var tenth = 10.toDouble()
    // example output
    println(first)
//----------------------------------------------------------------
    var one = "one"
    var two = "two"
    var three = "three"
    var four = "four"
    var five = "five"
    var six = "six"
    var seven = "seven"
    var eight = "eight"
    var nine = "nine"
    var ten = "ten"

    var combine_3 = one + two + three
    print(combine_3)
    var pairDouble1: Pair<String,String> = Pair(one, two)
    var pairDouble2: Pair<String,String> = Pair(three, four)
    var pairDouble3: Pair<String,String> = Pair(five, six)
    var pairDouble4: Pair<Int,Int> = Pair(first, second)
    var pairDouble5: Pair<Int,Int> = Pair(third, fourth)
//----------------------------------------------------------------
    var tripleOne =  Triple(1, 2, 3)
    var tripletwo =  Triple( 3, 4, 5)
    var tripleThree = Triple(6,7, 8)
    var tripleFour = Triple(9 ,10, 11)
    var tripleFive = Triple( 12, 13, 14)

    // section 6
    
    var nilaiSatu = 10
    var nilaiDua = 100

    var compareOne =  true
    var compareTwo = (nilaiSatu > nilaiDua)
    print(compareTwo)
    var compareThree = (nilaiSatu < nilaiDua)
    var compareFour = (nilaiSatu == nilaiDua)
    var compareFive = (nilaiSatu != nilaiDua)
    print(compareFive)
    var compareSix = !(nilaiSatu == nilaiDua)
    var compareSeven = !(nilaiSatu < nilaiDua)
    print(compareSeven)
    var compareEight = !(nilaiSatu == nilaiDua)
    var compareNine = !(nilaiSatu != nilaiDua)
    var compareTen = !(nilaiSatu > nilaiDua)
//----------------------------------------------------------------
    var totalFund = 10000000
    var pns = true

    var mertuaStatus1 = (totalFund < 10000000) && (pns == false)
    var mertuaStatus2 = (totalFund < 10000000) || (pns == false)
    println(mertuaStatus2)
    var mertuaStatus3 = (totalFund > 10000000) && (pns == false)
    var mertuaStatus4 = (totalFund == 10000000) || (pns == false)
    var mertuaStatus5 = (totalFund != 10000000) && (pns == false)
    println(mertuaStatus5)
    var mertuaStatus6 = (totalFund < 10000000) || (pns == true)
    var mertuaStatus7 = (totalFund > 10000000) && (pns == true)
    var mertuaStatus8 = (totalFund == 10000000) || (pns == true)
    var mertuaStatus9 = (totalFund != 10000000) && (pns == true)
    var mertuaStatus10 = (totalFund < 10000000) && (pns == true)
    println(mertuaStatus10)

//----------------------------------------------------------------
    var namaSaya = "Hanafi"
    var namaTemen = "Gusman"

    var compareString1= namaSaya == namaSaya
    var compareString2 = namaSaya > namaSaya // ngebandingin berdasarkan alfabet huruf pertama
    var compareString3 = namaSaya == namaTemen
    var compareString4 = namaSaya < namaTemen
    var compareString5 = namaSaya != namaTemen
    print(compareString5)
//----------------------------------------------------------------
    //parameter minimal
    var pekerjaan = "PNS"
    var gajiTunjangan = 1000000000
    var taatIbadah = true

    if(pekerjaan == "PNS" && 1200000000>gajiTunjangan){
        println("IDAMAN MERTUA 100%")
    }else{
        println("coba lagi")
    }

    if(pekerjaan != "PNS" || 1200000000>gajiTunjangan){
        println("IDAMAN MERTUA 85%")
    }else{
        println("coba lagi")
    }

    if(pekerjaan == "PNS" && 1200000000>gajiTunjangan && taatIbadah == true){
        println("IDAMAN MERTUA 1000000000%")
    }else{
        println("coba lagi")
    }

    if(pekerjaan == "PNS" && 1200000000>gajiTunjangan || taatIbadah == false){
        println("IDAMAN MERTUA 101%")
    }else{
        println("coba lagi")
    }

    if(pekerjaan != "PNS" || 1200000000>gajiTunjangan || taatIbadah == false){
        println("IDAMAN MERTUA 50%")
    }else{
        println("coba lagi")
    }

    println("input pekerjaan :")
    var myPekerjaan = readLine()
    println("input game :")
    var myGame= readLine()
    println("club bola favorit :")
    var myClub= readLine()

    if (myPekerjaan == "pns"){
        println("idaman")
    }else if (myPekerjaan == "polisi"){
        println("idaman")
    }else if (myPekerjaan == "tentara"){
        println("idaman")
    }else{
        println("no comment")
    }

    if (myGame == "pubg"){
        println("idaman")
    }else if (myGame == "dota"){
        println("idaman")
    }else if (myGame == "dota"){
        println("idaman")
    }else{
        println("no comment")
    }

    if (myClub == "mu"){
        println("idaman")
    }else if (myClub == "barcelona"){
        println("idaman")
    }else if (myClub == "real madrid"){
        println("idaman")
    }else{
        println("no comment")
    }
    
    // ============================================

    // section 7
    var count = 0

    while(count < 10){

        if (count < 5){
            println("hanafi ganteng" + " " + count)
        }else{
            println("hanafi tampan" + " " + count)
        }
        count++
    }

    var count_x = 0
    var count_y = 0

    while(count_x <= 3){
        count_x++
        println("-----------------------")
        count_y = 0
        while(count_y <= 5)
            println("hanafi ganteng" + " " + count_y)
        count_y++
    }

    var count_x = 0
    var count_y = 0

    while(count_x < 5) {

        if (count_x == 4) {
            break
        } else {
            println("hanafi aja")
            count_x++
        }
    }
// ===============================================


    var count = 0

    do{
        if (count < 5){
            println("hanafi ganteng" + " " + count)
        }else{
            println("hanafi tampan" + " " + count)
        }
        count++

    }while(count < 10)
    
    var count_x = 0
    var count_y = 0
    
    do{
        count_x++
        println("-----------------------")
        count_y = 0
        while(count_y <= 5)
            println("hanafi ganteng" + " " + count_y)
        count_y++
    }while(count_x <= 3)
    
    var count_x = 0
    
    do{
        println("hanafi aja")
        count_x++
    }while(count_x <= 3)
    
    while(count < 10){
        
        if
    }

    //---------------------------------------
    
    // section 9

    var zeroToten = 0..10
    var zeroTotwenty = 0..20
    var zerotoThirty = 0..30

    println("==============")
    var zeroToLessten = 0 until 10
    var zeroToLesstwenty = 0 until 20
    var zerotoLessThirty = 0 until 30
    print(zerotoLessThirty)

    println("==============")
    for (i in 0..10){
        println(i)
    }
    for (i in 0 until 10){
        println(i)
    }
    for (i in 10 downTo 1){
        println(i)
    }
    for (i in 0..100 step 5){
        println(i)
    }

    for (angka in 0..200 step 10){
        print(angka)
    }

    println("==============")
    repeat(5){
        println("hanafi ganteng")
    }

    var countless = 0
    repeat(10){
        countless++
    }
    print(countless)

    repeat(10 ){
        countless *=5
        countless /=2
    }
    print(countless)

//======================
    loopingforrow@ for (row in 0 until 10){
        println(row)
        loopingforcolumn@ for (column in 10 downTo 0){
            if(column == 5){
                break@loopingforrow
            }else{
                print(" ${column} ")
            }
        }

    }

    println("==============")

    var umur = 16

    when(umur){

        16,17,18 -> println("tua")
        else -> println("muda")
    }

    var nilai = 9

    when(nilai){
        //kasih parameter
        in 1..5 -> println("bagus")
        in 6..10 -> println("bagus banget")
        else -> println("kurang")
    }

    when(umur){

        16,17,18 -> println("tua tapi dapat nilai ${nilai}")
        else -> println("muda")
    }

    when (nilai){

        in 1..5 ->{
            println("nilai tidak bagus dengan score : ")
            print(nilai)
        }
        in 6..8 ->{
            println("nilai bagus dengan score : ")
            print(nilai)
        }
        in 9..10 ->{
            println("nilai sangat bagus dengan score : ")
            print(nilai)
        }
        else ->{ println("SCORE NOT FOUND")}
    }

    when (nilai) {

        in 1..5 -> {
            if (nilai < 3) {
                println("nilai sangat tidak bagus dengan score : ")
                print(nilai)
            } else {
                println("nilai tidak bagus dengan score : ")
                print(nilai)
            }
        }
        in 6..8 -> {
            if (nilai < 7) {
                println("nilai biasa dengan score : ")
                print(nilai)
            } else {
                println("nilai bagus dengan score : ")
                print(nilai)
            }
        }
        in 9..10 -> {
            if (nilai == 9) {
                println("nilai sangat bagus dengan score : ")
                print(nilai)
            } else {
                println("nilai sempurna dengan score : ")
                print(nilai)
            }
        }
        else -> {
            println("SCORE NOT FOUND")
        }

        print("============================")
            for (raw in 0..10) {
            when {
                raw % 2 == 0 -> println("${raw} adalah ganjil")
                else -> println("${raw} adalah genap")
            }
        }

        for (x in 100 downTo 11) {
            when {
                x % 7 == 0 -> println("angka ${x} adalah bilangan pembagi 5")
                x % 5 == 0 -> println("angka ${x} adalah bilangan pembagi 5")
                x % 3 == 0 -> println("angka ${x} adalah bilangan pembagi 3")
                x % 2 == 0 -> println("angka ${x} adalah bilangan pembagi 2")
                else -> println("angka ${x} kemungkinan prima")
            }
        }

            var lengthX = 10
        when (lengthX) {
            in 0..5 -> println("jelek")
            in 6..10 -> println("biasa")
            else -> println("bagus")
        }

//================================================
            // section 10
            var nama = "Hanafi Abdullah Gusman"
            var umur = 17
            var angka = 29
            var pendapatan = 9 //dalam juta aamiin
            var errorRespond = "406"
            var successRespond = "200"

        fun printNama() {

            println("nama saya Hanafi")
        }

            fun printErrorEx() {

            println("KODE 404 ERROR")
        }


        fun printVariable() {

            println("nama ${nama} dan umur ${umur} tahun")
        }

            fun printNama(nama : String) {
            println(nama)
        }

        fun printRespond(x: String) {
            println("API respond ${x}")
        }

            var apiRespond = "406"

        fun conditionalRespond(x: String) {
            if (apiRespond == errorRespond) {
                println("${printRespond(x)} gagal masuk API")
            } else {
                println("${printRespond(x)} berhasil masuk API")
            }
        }

            fun rumuslingkaran(jarijari: Int) Int {
            var luasLingkaran = 22.7 * jarijari * jarijari

            return luasLingkaran
        }

        fun valueNama(x: String): String {
            var nama = x
            return nama
        }

    }
        fun valueNamalengkap(x : String, y: String): String{
            var nama = valueNama(x) + " " + y
            return nama
         }

        fun volumePersegi(rumusPersegi:(Int) -> Int, sisi: Int, luas : Int): Int {
            var volumepersegi = rumusPersegi(luas) * sisi
            return volumepersegi
      }

        fun fullName(printNama: (String) -> String ,x : String, y : String): String{
            var namaPanjang = printNama(x) + " " + y
            return namaPanjang
         }

        fun devideTwo(simpleFunction: (Int, Int) -> Int, x: Int, y:Int, z: Int): Int{
        var result = simpleFunction(x,y) / z
        return result
        }

    //======================
    // section 8

    var arrayOfAsean : Array<String> = arrayOf("indonesia", "Malaysia", "Singapore", "Brunei", "Myanmar", "philiphina")
    var arrayOfAsia : Array<String> = arrayOf("China", "Japan", "Iran", "Australia", "Russia", "Iraq")
    var arrayOfeuropa : Array<String> = arrayOf("Jerman", "UK", "Italia", "Prancis", "Belanda", "Spanyol")

    var arrayOfnum1 : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    var arrayOfnum2 : Array<Int> = arrayOf(10,11,12,13,14,15,16,17)
    var arrayOfnum3 : Array<Int> = arrayOf(18,19,20,21,22,23,24,25,26,27)

    var listEmpty: List<String> = mutableListOf()
    var arrayListEmpty: ArrayList<Int> = arrayListOf()
    listEmpty += ("hanafigusman")
    listEmpty += ("hanafigusman")


    var arrayOfAsean : Array<String> = arrayOf("indonesia", "Malaysia", "Singapore", "Brunei", "Myanmar", "philiphina")
    var listOfAsean : ArrayList<String> = arrayListOf("indonesia", "Malaysia", "Singapore", "Brunei", "Myanmar", "philiphina")
    var arrayOfAsia : Array<String> = arrayOf("China", "Japan", "Iran", "Australia", "Russia", "Iraq")
    var arrayOfeuropa : Array<String> = arrayOf("Jerman", "UK", "Italia", "Prancis", "Belanda", "Spanyol")

    var arrayOfnum1 : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    var arrayOfnum2 : Array<Int> = arrayOf(10,11,12,13,14,15,16,17)
    var arrayOfnum3 : Array<Int> = arrayOf(18,19,20,21,22,23,24,25,26,27)

    var toIntArray = arrayOf(18,19,20,21,22,23,24,25,26,27).toString()

    var doubleList : List<Double> = listOf(1.0, 2.0 ,3.0, 4.0)
    var doubleList1 : List<Double> = listOf(5.0, 6.0 ,7.0, 8.0)
    var doubleList2 : List<Double> = listOf(9.0, 10.0 ,11.0, 12.0)

    var listofAsia: List<String> = mutableListOf()
    var listofAsean: List<String?> = mutableListOf()
    var listofAfrica: List<String>? = mutableListOf()


    println(doubleList.getOrNull(9))

    println(doubleList.size)
    println(doubleList.isEmpty())
    println(arrayOfeuropa.maxOrNull())
    println(arrayOfAsean.minOrNull())

    println(arrayOfeuropa.get(0))
    println(arrayOfAsia[0])

    println(doubleList.slice(1..3))
//    println(doubleList2.slice(1..4))

    if("america" !in arrayOfAsean){
        println("america tidak ada di ASEAN")
    }else{
        println("sebaliknya")
    }

    checkCountry("america",arrayOfAsean)


    if ("Timor Leste" !in listOfAsean){
        listOfAsean.add("Timor Leste")
    }
    listOfAsean.add(4,"laos")
    if ("Malaysia" in listOfAsean){
        listOfAsean.remove("Malaysia")
    }

    for (country in listOfAsean){

        print(country + " * ")
    }

    printaAllList(arrayOfeuropa)
}

fun checkCountry(country: String, listCountry: Array<String>){
    if (country in listCountry){
        println("${country} ada di ASEAN")
    }else{
        println("sebaliknya")
    }
}

fun printaAllList(listCountry: Array<String>){
    for (country in listCountry){
        print(" ${country}")
    }
}

//==================================
//section 11

    var indexNilai = mapOf('A' to "excellent", 'b' to "very good", 'c' to "good", 'd' to "bad")
    var peoplePower: Map<String,Int>  = mapOf("Thinking" to 100, "writting" to 90, "feeling" to 95, "excecute" to 97)
    var countryIndex = mapOf("INA" to "Indonesia", "MYS" to "Malaysia", "SIG" to "Singapore")
    var funcMath : Map<String, Double> = mapOf("lingkaran" to 3.14, "persegi" to 4.0, "segitiga" to 0.25)
    var handPhoneIndex = mapOf("sg" to "samsung","ap" to "apple", "op" to "oppo" )

    println(indexNilai['A'])
    println(funcMath.get("lingkaran"))
    println(handPhoneIndex["hw"])

    println(funcMath.isEmpty())
    println(peoplePower.size)

    var indexNilaiMut = mutableMapOf('A' to "excellent", 'b' to "very good", 'c' to "good", 'd' to "bad")
    var peoplePowerMut: Map<String,Int>  = mutableMapOf("Thinking" to 100, "writting" to 90, "feeling" to 95, "excecute" to 97)
    var countryIndexMut = mutableMapOf("INA" to "Indonesia", "MYS" to "Malaysia", "SIG" to "Singapore")
    var funcMathMut : Map<String, Double> = mutableMapOf("lingkaran" to 3.14, "persegi" to 4.0, "segitiga" to 0.25)
    var handPhoneIndexMut = mutableMapOf("sg" to "samsung","ap" to "apple", "op" to "oppo" )

    indexNilaiMut['E'] = "So Bad"
    indexNilaiMut.put('F', "Not Found")
    print(indexNilaiMut)
    indexNilaiMut['E'] = "Too Bad"
    indexNilaiMut.remove('F')
    indexNilaiMut['E'] = "So Bad"

    for ((countryCode, NameCountry) in countryIndexMut){
        println("${countryCode} and ${NameCountry}")
    }
    iterateAllMaps(handPhoneIndexMut)

    for (peopleKey in peoplePower.keys){
        println("${peopleKey}")
    }

    for (funcValue in funcMathMut.values){
        println("${funcValue}")
    }
    }

    fun iterateAllMaps(listMaps : Map<String, String>) {
        for ((x, y) in listMaps) {
            println(x + y)
        }
    }

    var setOfAsean = setOf(*arrayOfAsean)
    var setOfAsia = setOf(*arrayOfAsia)
    var setOfEuropa = setOf(*arrayOfEuropa)

//=======================================
// section 12

    var expressName : (String) ->String

    expressName = {nama: String -> String

        "my name is ${nama}"

    }

    println(expressName("hanafi"))

    var countNumber : (Int, Int) ->Int

    countNumber = {number_1: Int, number_2: Int -> Int

        number_1 + number_2

    }

    println(countNumber(1,2))

    countNumber = {number_1: Int, number_2: Int -> Int

        number_1 + number_2

    }

    println(countNumber(1,2))

    var comparisonVar : (String, String) -> String

    comparisonVar = {x: String, y: String -> String

        "my first name is ${x} and my last name is ${y}"

    }

    println(comparisonVar("hanafi","gusman"))

    var devideByTwo: (Int) -> Int

    devideByTwo = {number_x : Int -> Int

        number_x / 2

    }

    println(devideByTwo(200))

    var currencyAuto: (Int) -> String

    currencyAuto = {num_x : Int -> String

        "Rp.${num_x}.00-"
    }

    println(currencyAuto(5000))

    var partOfName: (String, String) ->String

    partOfName = {name_x, name_y ->

        "${name_x} is the first name and ${name_y} is last name"
    }

    println(partOfName("hanafi", "gusman"))

    var modByTwo: (Int) -> Int

    modByTwo = {number ->

        number % 2
    }

    println(modByTwo(10))

    var simpleName: (String) -> String = { "${it} is my name"}

    println(simpleName("HANAFI ABDULLAH GUSMAN"))

    var plusByFive: (Int) -> Int

    plusByFive = { it: Int ->

        it + 5
    }

    println(plusByFive(10))

    var autoCurrenct: (Int) -> String = {"Rp.${it}.00.-"}

    println(autoCurrenct(5000))

    fun lambdasAutoVar(x : Int, y: Int, lambdas :(Int, Int) -> Int): Int{
        var lambdas = lambdas(x,y)
        return lambdas
    }

    var lambdas = {num_x : Int, num_y : Int -> Int

        num_x * num_y
    }

    println(lambdasAutoVar(10,200, lambdas)

    fun autoRename(x : String, y: String, lambdas: (String, String) -> String):String {
        var lambdas = lambdas(x, y)
        return lambdas
    }

  )

    var autoName = {name_x :String, name_y :String -> String

        "${name_x} ${name_y}"

    }

    println(autoName("hanafi","gusman"))

    fun noValues(): () -> Int{
        var number = 10
        var numberDiv:() -> Int = {
            number *= 10
            number
        }

        return numberDiv
    }

    var noValue = noValues()
    println(noValue())

    fun autoName() : () -> String {
        var footballName = "Bonnuci"
        var footballVar: () -> String = {
            footballName
        }
    }
    var namePlayer = autoName()
    println(autoName())

    var PeopleName = arrayOf("hanafi", "Budi", "Wawan")

    println(PeopleName.sortedWith(compareBy(
    {
        it.length
    }
    )).joinToString())

    var numberFromTen = arrayListOf("Italia", "Inggris", "Spain")

    println(numberFromTen.sortedWith(compareBy(
    {
        it.length
    }

    )))

    var numberFunc = arrayListOf(1,2,3,4,5,6,7,9,10)

    println(numberFunc.map{
        it * 10
    })

    println(numberFunc.map{
        it.toDouble()
    }.joinToString())

    println(numberFunc.fold(0, {first: Int,second: Int -> Int

        first + second
    }))

//=========================================================
// section 13

    class footballPlayer (var name : String, var age : Int){

        val playerName: String
            get() = name
        val agePlayer : Int
            get() = age


    }

    val footballName = footballPlayer("maldini", 39)
    println(footballName.playerName)
    println(footballName.agePlayer)

    class studentsDetail (val name : String, var age : Int, var semester: Int, var index : MutableList<Double> = mutableListOf()) {

    }

    var studentTelkom = studentsDetail("hanafi",20, 8)
    studentTelkom.index.add(4.0)

    println(studentTelkom.age)

    class staffOfyear (name: String, age: Int, position : String){

        var name = name
        var age = age
        var position = position
    }
    var bestStaff = staffOfyear("Budi",55, "CEO")
    println(bestStaff.name)

    var bestManager = bestStaff
    println(bestStaff.position)

    var ItbStudent = studentTelkom
    println(studentTelkom.index.joinToString())

    var unpadStduent = studentsDetail()

    if (ItbStudent == studentTelkom){
        println("TRUE")
    }else{
        println("FALSE)
    }

    if (unpadStduent == studentTelkom){
        println("TRUE")
    }else{
        println("FALSE)
    }


    data class playerFootball(var name : String, var age : Int){
        // data yang di assign kesimpen di class ini semua
    }

    var manUtd = playerFootball("ronaldo", 20)
    var milanAc = playerFootball("ronaldinho", 30)



    data class staff (var name: String, var age: Int, var position : String){

    }

    data class students (val name : String, var age : Int, var semester: Int, var index : MutableList<Double> = mutableListOf()) {

    }

    //descrutive declaration
    var (name) = manUtd

    var student_1: Student = Student("hanafi", 20, 8, studentDetail.STUDENTS_UNIVERSITY)
    var student_2: Student = Student("budi", 30, 20, studentDetail.STUDENTS_UNIVERSITY)

    studentDetail.addStudent(student_1)
    studentDetail.addStudent(student_2)
    studentDetail.printAllAnimal()
    //=======================================================================
    var football_1 = footBallPlayer.seeAge("Ronaldo", 37, "Juventus", 7)
    var football_2 = footBallPlayer.seeAge("Mesi", 20, "Free Agent", 10)

    footballDetail.addName(football_1)
    footballDetail.addName(football_2)
    footballDetail.printAllPlayer()
    //=======================================================================
    var projects_1 = projectData("pengembangan web", 2000.0, "PT. Jaya Makmur Abadi", 200)
    //    projects_1.duration = projects_1.duration/30
    var projects_2 = projectData("pembuatan IOT untuk pabrik", 10000.0, "PT. Janji jiwa", 1000)

    projectsDetail.addName(projects_1)
    projectsDetail.addName(projects_2)
    projectsDetail.printAllProjects()

    //=======================================================================
    var people_1 = peopleNearby.nearbyStatus("Nara", 120, "XC0AAA", "")
    var people_2 = peopleNearby.nearbyStatus("Boruto", 50000000, "XC0BAA", "")

    peopleNearbyDetail.addName(people_1)
    peopleNearbyDetail.addName(people_2)
    peopleNearbyDetail.printAllProjects()
    peopleNearbyDetail.removeAllPeople()

    //=======================================================================
    //companion
    println("===========================")
    var studentOne: StudentClass = StudentClass.editSemester("hanafi", 20, 8)
    var studentTwo: StudentClass = StudentClass.editSemester("budi", 30, 20)

    println(studentOne)
    println(studentTwo)



    var student_3 = StudentWithID.createStudent("Jason", 20, 8)
    println(student_3.ID)

    var student_4 = StudentWithID.changeStudentName("Prio", 22, 7)
    println(student_4.name)


}
class city (val name : String, val country : String, var population : Int, isFull: Boolean = false){

    companion object{
        var desity = 1000 //variabel dengan nilai yang ada di semua kelas
        var countCity = 0
    }
    val uploadReady : String by lazy{
        println("sucessfull Upload")
        "upload $name"
    }
    var countBuilding : Int
    var countBusiness : Int
    var countResto : Int

    init {
        countBuilding = 0
        countBusiness = 0
        countResto = 0
    }

    var populationIndicator: Int
        get(){
            return population/countBuilding
        }
        set(value){
            population = value
        }

    var newCity: Boolean by
    Delegates.observable(false){
            _, oldValue, newValue ->
        if (newValue){
            countCity++
        }

    }

    var desityAmount by Delegates.observable(0)
    {
            _,_,newValue ->
        if (newValue > desity){
            println("MAXIMUM DESITY")
            false
        }else{
            true
        }

    }
}

class footballPlayer(val name : String, var club : String, var apperances : Int, isActive: Boolean = true){

    companion object{
        var maxSalary = 1000
        var countPlayer = 0
    }
    val uploadReady : String by lazy{
        println("sucessfull Upload")
        "upload $name"
    }
    var countBodyBuilder : Int

    init {
        countBodyBuilder = 0
    }

    var bodyConcept: Int
        get(){
            return apperances/countBodyBuilder
        }
        set(value){
            countBodyBuilder = value
        }

    var newCity: Boolean by
    Delegates.observable(false){
            _, oldValue, newValue ->
        if (newValue){
            countPlayer++
        }

    }

    var salaryAmount by Delegates.observable(0)
    {
            _,_,newValue ->
        if (newValue > maxSalary){
            println("MAXIMUM SALARY")
            false
        }else{
            true
        }

    }

}


class Students (val name : String, var studied: String, var semester : Int, var score : Int){
    companion object{
        var yearOfStudied = 6 //variabel dengan nilai yang ada di semua kelas
        var minScore = 2
        var countStudent = 0
    }
    val uploadReady : String by lazy{
        println("sucessfull Upload")
        "upload $name"
    }
    var countCoreStudied : Int
    var countNonCoreStudied : Int

    init {
        countCoreStudied = 30
        countNonCoreStudied = 30
    }

    var strongIndicator: Int
        get(){
            return semester/(score *countCoreStudied)
        }
        set(value){
            score = value
        }

    var newCity: Boolean by
    Delegates.observable(false){
            _, oldValue, newValue ->
        if (newValue){
            countStudent++
        }

    }

    var studiedAmount by Delegates.observable(0)
    {
            _,_,newValue ->
        if (newValue > yearOfStudied){
            println("MAXIMUM STUDIED")
            false
        }else{
            true
        }

    }

    var scoreAmount by Delegates.observable(0)
    {
            _,_,newValue ->
        if (newValue < minScore){
            println("DROP OUT")
            false
        }else{
            true
        }

    }


}

class people (){
    var people : String = ""
    var ID : String = ""
    var jobs : String = ""
    lateinit var hobbies: String

}






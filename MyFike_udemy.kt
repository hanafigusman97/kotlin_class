
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



}




}





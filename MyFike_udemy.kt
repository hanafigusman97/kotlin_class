
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



}



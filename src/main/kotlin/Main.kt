fun main(args: Array<String>) {
    val isKenyanCitizen = true
    var ageOfStudent = arrayOf(21, 23, 24, 45, 32, 18)
    var phoneNumber = arrayOf(+251123456785, +2541134578282, +254114536785, +254113478965, +234734567487)
    var weightOfStudents = arrayOf(45, 67, 48, 98, 76)

    //student information
    var novak254 = arrayOf("Novak Kelvin", isKenyanCitizen, ageOfStudent[0], phoneNumber[0], weightOfStudents[0])
    var fredData = arrayOf("Programmer Fred", !isKenyanCitizen, ageOfStudent[1], phoneNumber[1], weightOfStudents[1])
    var millieData = arrayOf("Kerubo Millicent", isKenyanCitizen, ageOfStudent[2], phoneNumber[2], weightOfStudents[2])
    var wandaData = arrayOf("Elizabeth Wanda", !isKenyanCitizen, ageOfStudent[3], phoneNumber[3], weightOfStudents[3])
    var veeData = arrayOf("Ndemo Veronica", isKenyanCitizen, ageOfStudent[4], phoneNumber[4], weightOfStudents[4])

    //Prints Student's

    println(novak254.contentToString())
    println(fredData.contentToString())
    println(millieData.contentToString())
    println(wandaData.contentToString())
    println(veeData.contentToString())
}
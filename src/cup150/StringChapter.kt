
//Problem 1
fun hasSameChar(input: String):Boolean{
    var result = false
    var i = 0
    while(i < input.length && !result){
        var currentChar = input[i]
        for(j in i+1 until input.length){
            if(input[j] == currentChar){
                result = true
                println("duplicate char is $currentChar")
                break
            }
        }
        i++
    }
    return result

}

//Problem 3
fun permuation(s1: String, s2: String):Boolean{
    //s1List :MutableList = s1.
    return false
}


fun main() {
    println(hasSameChar("it's noalm"))
}
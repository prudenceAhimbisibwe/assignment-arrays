//1.Write a function that takes in an array of integers and returns the product of
//all the elements(3pts)
//2.Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements(3pts)
//3.Write a function that takes in an array of characters and returns the number of
//vowels in the array(4pts)
fun main(){
    var x = multiply(arrayOf(1,2,3,4,5,6))
    println(x)
    var y = Decimal(arrayOf(5,8,72.8,21,5.8,"prudence",0.2))
    println(y)
    var  z = content(arrayOf('a','e','i','o','u'))
    println(z)

}
fun multiply(number: Array<Int>):Int {
    var product = 1
    number.forEach { num ->
        product *= num
    }
    return product
}
fun Decimal(mixedArray: Array<Any>):Double {
    var sum = 0.00
    mixedArray.forEach { number ->
        if (number is Double) {
            sum += number
        }
    }
        return sum
    }
fun content(text:Array<Char>):Int{
    var vowels =0
    text.forEach { char ->
        if (char== 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'){
            vowels++
        }
    }
    return vowels

}









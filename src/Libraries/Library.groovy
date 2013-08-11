package Libraries
/**
 * Created with IntelliJ IDEA.
 * User: James
 * Date: 8/9/13
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
class Library {

    public static primeCheck (int number) {
        def top = Math.sqrt(number)
        def toReturn = true
        if(number != 2) {
            if (number%2 == 0) toReturn = false
            else {
                for(def i = 3; i <= top; i += 2) {
                    if(number % i == 0) {
                        toReturn = false
                        break
                    }
                }
            }
        }
        toReturn
    }

    def static largestNumberOfDivisors = 0

    public static numberOfDivisors (int number) {
        def divisorMap = new Vector()

        for(def it = 1; it <= number; it++)    {
            if(number%it == 0) {

                if(!divisorMap.contains(it.toString())) {
                    divisorMap.add(it.toString())
                    divisorMap.add((number/it).toString())
                }
                else {
                    break
                }
            }
        }
        def divisors = divisorMap.size()
        if(divisors > largestNumberOfDivisors) {
            largestNumberOfDivisors = divisors
            println "$divisors at $number"
        }
        divisors
    }




}

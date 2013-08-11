import Libraries.Library

/**
 * Created with IntelliJ IDEA.
 * User: James
 * Date: 8/9/13
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */



def primeCount = 1
def currentValue = 3
def lastPrime = 3


//println primeCheck(3769)
//
//println primeCheck(21)

while(primeCount <10001) {
    if(Library.primeCheck(currentValue)) {
        lastPrime = currentValue
        primeCount++
        println lastPrime
    }
    currentValue++
}

println lastPrime

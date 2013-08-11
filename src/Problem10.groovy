
import Libraries.Library
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.
/**
 * Created with IntelliJ IDEA.
 * User: James
 * Date: 8/9/13
 * Time: 11:38 PM
 * To change this template use File | Settings | File Templates.
 */

long sum = 0
(2..2000000).each {it->
    if(Library.primeCheck(it)) {
        sum += it
        println "current: $it total = $sum"
    }
}
println sum
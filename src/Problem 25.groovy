
/**
 * Created with IntelliJ IDEA.
 * User: jamesmueller
 * Date: 8/22/13
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */


def bigNumber = 10**999

BigInteger current = 2, oneAgo = 1, iteration = 3
println bigNumber.toString().length()

while (current <= bigNumber) {
    BigInteger newCurrent = oneAgo + current
    oneAgo = current
    current = newCurrent
    iteration++
    println "$iteration, $current, $oneAgo"
}
println iteration
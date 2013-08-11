import Libraries.Library
/**
 * Created with IntelliJ IDEA.
 * User: James
 * Date: 8/10/13
 * Time: 8:10 AM
 * To change this template use File | Settings | File Templates.
 */

def currentAddition = 2
def triangle = 1
def threshold = 500

while(Library.numberOfDivisors(triangle) <= threshold) {
    triangle += 2*currentAddition+1
    currentAddition+=2
}
println triangle
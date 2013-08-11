
/**
 * Created with IntelliJ IDEA.
 * User: James
 * Date: 8/10/13
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */


def answermap = new HashMap<Integer,Integer>()

def collatzLengthRecursive
collatzLengthRecursive = {number->
    def value = (int) number
    if(answermap.containsKey(value)) {
        return answermap.get(value)
    }
    else {
        if(value == 1) {
            return 1
        }
        else if(value%2==0) {
            def length = collatzLengthRecursive.trampoline(value/2) + 1
            answermap.put(value, length)
            return length
        }
        else {
            def length = collatzLengthRecursive.trampoline(3*value + 1) + 1
            answermap.put(value, length)
            return length
        }
    }
}.trampoline()

def longestChain = 0
def longestValue
for(def it = 1; it <= 1000000; it++) {
    println it
    def length = collatzLengthRecursive it
    if (length > longestChain) {
        longestValue = it
        longestChain = length
        println "longest value=$longestValue, longest chain=$longestChain"
    }
}

println longestValue
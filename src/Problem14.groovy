import groovy.transform.Field

@Field Map<Integer, Integer> answermap = new HashMap<Integer,Integer>()

def collatzLength(int number) {
    if(answermap.containsKey(number)) {
        return answermap.get(number)
    }
    def sequence = new ArrayList()
    def length = 0
    long current = number
    while(!answermap.containsKey(current)) {
        sequence.add(current)
        length++
        if(current == 1) break;
        if((current&1)==0) {
            current = current / 2
        }
        else {
            current = 3 * current + 1
        }
    }
    if(answermap.containsKey(current)) {
        length += answermap.get(current)
    }
    valueLength = length
    sequence.each { it ->
        answermap.put it, valueLength
        valueLength = valueLength - 1
    }
    return length
}

def collatzLengthNonMemoized(val) {
    def length=0
    long number = val
    while(number != 1) {
        length++
        if((number&1)==0) {
            number = number/2
        }
        else number = 3*number + 1
    }
    return length
}

def longestChain = 0
def longestValue
for(def it = 3; it <= 1000000; it = it + 2) {
    def length = collatzLengthNonMemoized(it)
    if (length > longestChain) {
        longestValue = it
        longestChain = length
        println "Longest Value: $longestValue"
    }
}

println longestValue
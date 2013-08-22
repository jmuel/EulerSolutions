

/**
 * Created with IntelliJ IDEA.
 * User: jamesmueller
 * Date: 8/22/13
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */

def nameList
def nameScore = 0
def currentName = 1
final def capitalOffset = 64

new File("../Files/names.txt").eachLine{ it->
    it = it.replace($/"/$, '')
    nameList = it.split(',').sort()
}

def alphaValue = { String name ->
    def value = 0
    name = name.toUpperCase()
    (0..name.size()-1).each{ it->
        value += name.charAt(it) - capitalOffset
    }
    value
}

nameList.each { it ->
    nameScore += alphaValue(it) * currentName
    currentName++
}

println nameScore
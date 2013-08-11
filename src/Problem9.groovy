
/**
 * Created with IntelliJ IDEA.
 * User: James
 * Date: 8/9/13
 * Time: 11:12 PM
 * To change this template use File | Settings | File Templates.
 */

for(def i = 1; i < 1000; i++) {
    for(def j = 1; j < 1000; j++) {
        def c = Math.sqrt(i*i + j*j)
        if((i + j + c) == 1000) {
            println "a=$i b= $j c=$c"
            println i*j*c
        }
    }
}
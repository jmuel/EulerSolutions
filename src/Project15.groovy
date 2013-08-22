
/**
 * Created with IntelliJ IDEA.
 * User: jamesmueller
 * Date: 8/22/13
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 */

BigInteger[][] grid = new BigInteger[21][21]

(1..20).each{
    grid[0][it] = 1
    grid[it][0] = 1
}

(1..20).each{ a ->
    (1..20).each {b ->
        def val1 = grid[a-1][b]
        def val2 = grid[a][b-1]
        println "$a, $b"
        grid[a][b] =  val1 + val2
    }
}

println grid[20][20]
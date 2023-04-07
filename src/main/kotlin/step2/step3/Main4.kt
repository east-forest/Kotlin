package step2.step3

import kotlin.math.abs

/**
 * https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__find_pair
 */
fun main() {
    val n = readLine()!!.toInt()
    val list = List(n) {
        readLine()!!.toInt()
    }

    var diff = 100
    var shorter = 0
    var taller = 0

    for(i in 0 until list.size-1) {
        for(j in i+1 until list.size) {
           if(diff > abs(list[i]-list[j])) {
               diff = abs(list[i]-list[j])
               if(list[i]<list[j]) {
                   shorter = list[i]
                   taller = list[j]
               } else {
                   shorter = list[j]
                   taller = list[i]
               }
           }
        }
    }
    println(shorter)
    println(taller)
}
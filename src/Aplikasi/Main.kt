package Aplikasi

import Data.Koleksi
import Data.Program

fun main() {
    var i = 1
    do {
        println("")
        println("==============Round $i==============")
        i++


        println("Pilih Salah Satu Angka di Bawah ini:")
        println( "(1= Batu, 2 = Gunting, 3= Kertas)")

        val input1 = readLine()?.toInt()
        val input2 = (1..3).random()

        println("MUSUH : $input2")

        println("-------------HASILNYA-------------")

        val program = Program(hasilData)

        if (input1!! >= 4) {
            println("Nilai yang anda masukan tidak sesuai, coba masukan lagi")
        } else {
            program.hitung(
                input1.minus(1),
                input2.minus(1)
            )
        }


    } while (i <= 5)
}

val hasilData = object : Koleksi {
    override fun showResult(msg: String) {
        println(msg)
    }
}
package Data

class Program(private val koleksi: Koleksi) {
    private val data = mutableListOf("Batu", "Gunting", "Kertas")

    fun hitung(player1: Int, player2: Int) {
        val p1 = data[player1]
        val p2 = data[player2]


        koleksi.showResult(
            "ANDA = $p1, MUSUH = $p2"
        )

        when {
            p1 == data[1] && p2 == data[0]
            -> println("ANDA KALAH HAHAHA...")
            p1 == data[1] && p2 == data[2]
            -> println("ANDA MENANG")
            p1 == data[2] && p2 == data[0]
            -> println("ANDA MENANG")
            p1 == data[2] && p2 == data[1]
            -> println("ANDA KALAH HAHAHA")
            p1 == data[0] && p2 == data[1]
            -> println("ANDA MENANG")
            p1 == data[0] && p2 == data[2]
            -> println("ANDA KALAH HAHAHA")
            else -> println("HASILNYA SERI")

        }

    }

}
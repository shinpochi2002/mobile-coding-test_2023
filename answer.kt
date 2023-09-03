fun main() {
    val input = readLine()
    var N = 0
	if (input != null) {
    	N = input.toInt()
	} else {
    	println("入力がnullです。有効な整数を入力してください。")
	}
    for (i in 1..N) {
        // 空白を出力
        for (j in 1..(N - i)) {
            print(" ")
        }

        // 数値を出力
        for (j in 1..i) {
            print(j % 10)
        }

        // 数値を逆順に出力
        for (j in (i - 1) downTo 1) {
            print(j % 10)
        }

        // 改行を出力
        println()
    }
}

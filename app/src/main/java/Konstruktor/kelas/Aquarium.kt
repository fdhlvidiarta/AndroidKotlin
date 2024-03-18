package Konstruktor.kelas

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40)  {
        init {
            println("Aquarium Initializing")
        }
        init {
            //1 liter = 1000 cm^3
            //println("Volume: ${width * length * height / 1000} l")
        }
        var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
        set(value) {
            height = (value * 1000) / (width * length)
        }
        constructor(numberOfFish: Int) : this() {
            // 2,000 cm^3 per ikan + ruang ekstra agar air tidak tumpah
            val tank = numberOfFish * 2000 * 1.1
            // calculate the height needed
            height = (tank / (length * width)).toInt()
        }
        fun pSize() {
            println("Width: $width cm Length: $length cm Height: $height cm")
            println("Volume: $volume l") // 1 l = 1000 cm^3 (memanggil var volume)
        }
        fun printSize() {
            println("Width: $width cm " + "Length: $length cm " + "Height: $height cm ")
        }
}
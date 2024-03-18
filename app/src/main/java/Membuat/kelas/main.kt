package Membuat.kelas
import Membuat.kelas.Aquarium
fun buildAquarium() {
    var myAquarium = Aquarium()
    myAquarium.pSize()
    myAquarium.height = 60
    myAquarium.pSize()

}
fun main() {
    buildAquarium()
}

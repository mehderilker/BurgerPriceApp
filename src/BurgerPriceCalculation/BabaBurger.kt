package BurgerPriceCalculation

class BabaBurger : Hamburger("Baba Burger","Beyaz","Kırmızı",19.25) {

    //Kesin Olacaklar inir'de tanımlanır.
    init {
        super.ekleExUrun1("Patates Kızartması",3.5)
        super.ekleExUrun2("Kola",4.5)
    }

    // Ekstra Ürün Girildiğinde Hata Ver

    override fun ekleExUrun1(Ad: String, Ucret: Double) {
        println("İlave Ürün Ekleyemezsiniz")
    }

    override fun ekleExUrun2(Ad: String, Ucret: Double) {
        println("İlave Ürün Ekleyemezsiniz")
    }

    override fun ekleExUrun3(Ad: String, Ucret: Double) {
        println("İlave Ürün Ekleyemezsiniz")
    }

    override fun ekleExUrun4(Ad: String, Ucret: Double) {
        println("İlave Ürün Ekleyemezsiniz")
    }
}
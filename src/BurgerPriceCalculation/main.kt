package BurgerPriceCalculation

fun main(args: Array<String>) {

    val h1 : Hamburger= Hamburger("Sade","Beyaz","Kırmızı",8.8)

    h1.ekleExUrun1("Ketcap",1.5)
    h1.ekleExUrun2("Soğan Halkası",3.2)
    var toplamUcret =  h1.hamburgerBilgileri()
    println("Toplam Ucret "+ toplamUcret)

    val s1 : SaglikliBurger= SaglikliBurger("Balık",11.9)

    s1.ekleSaglikliUrun1("Kekik",5.3)
    s1.ekleSaglikliUrun2("Zencefil",123.3)
    toplamUcret = s1.hamburgerBilgileri()
    println("Sağlıklı Haburger Toplam Fiyatı : $toplamUcret ")

    val b1 : BabaBurger = BabaBurger()
    h1.hamburgerBilgileri()

    toplamUcret = b1.hamburgerBilgileri()
    println("Toplam Ucret : $toplamUcret")

}
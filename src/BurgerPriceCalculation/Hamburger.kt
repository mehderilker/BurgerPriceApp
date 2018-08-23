package BurgerPriceCalculation

open class Hamburger(private var Isım:String, private var ekmekCesidi : String,private var etCesidi : String, private var ucret : Double) {

    private var exUrunAdı :String = ""
    private var exUrunFiyat1 :Double = 0.0

    private var exUrunAdı2 :String? = null
    private var exUrunFiyat2 :Double? = null

    private var exUrunAdı3 :String? = null
    private var exUrunFiyat3 :Double? = null

    private var exUrunAdı4 :String? = null
    private var exUrunFiyat4 :Double? = null

    open  fun ekleExUrun1(Ad: String,Ucret:Double){
        this.exUrunAdı=Ad
        this.exUrunFiyat1=Ucret
    }
    open fun ekleExUrun2(Ad: String,Ucret:Double){
        this.exUrunAdı2=Ad
        this.exUrunFiyat2=Ucret
    }
    open fun ekleExUrun3(Ad: String,Ucret:Double){
        this.exUrunAdı3=Ad
        this.exUrunFiyat3=Ucret
    }
    open fun ekleExUrun4(Ad: String,Ucret:Double){
        this.exUrunAdı4=Ad
        this.exUrunFiyat4=Ucret
    }

    open fun hamburgerBilgileri():Double{
        var toplamUcret = this.ucret
        println("Hamburger Adı : ${this.Isım}   Ekmek : ${this.ekmekCesidi}   Et: ${this.etCesidi}   ÜCRET : ${this.ucret}" )

        if (!this.exUrunAdı.isNullOrEmpty()){
            toplamUcret += this.exUrunFiyat1
            println("Extra Ürün : ${this.exUrunAdı} Ücret : ${this.exUrunFiyat1}")
        }
        if (!this.exUrunAdı2.isNullOrEmpty()){
            toplamUcret += this.exUrunFiyat2 !!
            println("Extra Ürün : ${this.exUrunAdı2} Ücret : ${this.exUrunFiyat2}")
        }
        if (!this.exUrunAdı3.isNullOrEmpty()){
            toplamUcret += this.exUrunFiyat3 !!
            println("Extra Ürün : ${this.exUrunAdı3} Ücret : ${this.exUrunFiyat3}")
        }
        if (!this.exUrunAdı4.isNullOrEmpty()){
            toplamUcret += this.exUrunFiyat4 !!
            println("Extra Ürün : ${this.exUrunAdı4} Ücret : ${this.exUrunFiyat4}")
        }
        return toplamUcret
    }



}
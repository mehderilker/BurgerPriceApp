package BurgerPriceCalculation

class SaglikliBurger(private var etCesidi: String, private var Ucret:Double) : Hamburger("Sağlıklı Burger","Kepekli",etCesidi,Ucret){
    private var ExtraSaglikliUrunAdı1 : String ??= null
    private var ExtraSaglikliUcret1 : Double ??= null

    private var ExtraSaglikliUrunAdı2 : String ??= null
    private var ExtraSaglikliUcret2: Double ??= null

    fun ekleSaglikliUrun1(ad:String,fiyat:Double){
        this.ExtraSaglikliUrunAdı1=ad
        this.ExtraSaglikliUcret1=fiyat
    }
    fun ekleSaglikliUrun2(ad:String,fiyat:Double){
        this.ExtraSaglikliUrunAdı2=ad
        this.ExtraSaglikliUcret2=fiyat
    }

    override fun hamburgerBilgileri(): Double {
        var toplamUcret = super.hamburgerBilgileri()
        if (!this.ExtraSaglikliUrunAdı1.isNullOrEmpty()){
            toplamUcret += this.ExtraSaglikliUcret1 !!
            println("Extra Ürün : ${this.ExtraSaglikliUrunAdı1} Ücret : ${this.ExtraSaglikliUcret1}")
        }
        if (!this.ExtraSaglikliUrunAdı2.isNullOrEmpty()){
            toplamUcret += this.ExtraSaglikliUcret2!!
            println("Extra Ürün : ${this.ExtraSaglikliUrunAdı2} Ücret : ${this.ExtraSaglikliUcret2}")
        }

        return toplamUcret
    }


}
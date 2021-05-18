package com.berin.firstgetir

import java.io.Serializable

data class Kategoriler(var kategori_id:Int
                       ,var kategori_adi:String
                       ,var kategori_resim_adi:String
                       ,var urun_sayi:Int):Serializable{

}
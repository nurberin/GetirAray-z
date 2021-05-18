package com.berin.firstgetir

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.berin.firstgetir.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding
    private lateinit var kategorilerListesi:ArrayList<Kategoriler>
    private lateinit var adapter: KategorilerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim =DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
        //tasarim.rv.layoutManager = GridLayoutMana ger(requireContext(),4) //bunu denedim yine boşluklu çıktı

        //tasarim.toolbarAnasayfa.title = "getir"

        //(activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)


        val k1 = Kategoriler(1,"Yeni Ürünler","yeniurunler",3)
        val k2 = Kategoriler(2,"İndirimler","indirimler",1)
        val k4 = Kategoriler(4,"Su & İçecek","suicecek",3)
        val k5 = Kategoriler(5,"Meyve & Sebze","meyvesebze",3)
        val k6 = Kategoriler(6,"Fırından","firindan",3)
        val k7 = Kategoriler(7,"Temel Gıda","temelgida",3)
        val k8 = Kategoriler(8,"Atıştırmalık","atistirmalik",3)
        val k9 = Kategoriler(9,"Dondurma","dondurma",3)
        val k10 = Kategoriler(10,"Yiyecek","yiyecek",3)
        val k11 = Kategoriler(11,"Süt & Kahvaltı","sutkahvalti",3)
        val k12 = Kategoriler(12,"Fit & Form","fitform",3)
        val k13 = Kategoriler(13,"Kişisel Bakım","kisiselbakim",3)
        val k14 = Kategoriler(14,"Ev Bakım","evbakim",3)
        val k15 = Kategoriler(15,"Ev & Yaşam","evyasam",3)
        val k16 = Kategoriler(16,"Teknoloji","teknoloji",3)
        val k17 = Kategoriler(17,"Evcil Hayvan","evcilhayvan",3)
        val k18 = Kategoriler(18,"Bebek","bebek",3)
        val k19 = Kategoriler(19,"Cinsel Sağlık","cinselsaglik",3)
        val k20 = Kategoriler(20,"Giyim","giyim",3)


        kategorilerListesi = ArrayList()
        kategorilerListesi.add(k1)
        kategorilerListesi.add(k2)
        //kategorilerListesi.add(k3)
        kategorilerListesi.add(k4)
        kategorilerListesi.add(k5)
        kategorilerListesi.add(k6)
        kategorilerListesi.add(k7)
        kategorilerListesi.add(k8)
        kategorilerListesi.add(k9)
        kategorilerListesi.add(k10)
        kategorilerListesi.add(k11)
        kategorilerListesi.add(k12)
        kategorilerListesi.add(k13)
        kategorilerListesi.add(k14)
        kategorilerListesi.add(k15)
        kategorilerListesi.add(k16)
        kategorilerListesi.add(k17)
        kategorilerListesi.add(k18)
        kategorilerListesi.add(k19)
        kategorilerListesi.add(k20)

        adapter = KategorilerAdapter(requireContext(),kategorilerListesi)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }
}
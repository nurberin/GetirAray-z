package com.berin.firstgetir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.berin.firstgetir.databinding.FragmentDetaySayfaBinding


class DetaySayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentDetaySayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_detay_sayfa, container, false)

        val b:DetaySayfaFragmentArgs by navArgs()
        val gelenNesne = b.nesne
        tasarim.imageViewKategoriResim.setImageResource(
            resources.getIdentifier(gelenNesne.kategori_resim_adi,"drawable",requireContext().packageName))

        tasarim.textViewurunSayisi.text = "Bu kategoride " + gelenNesne.urun_sayi.toString() + " ürün bulunuyor."

        return tasarim.root
    }

}
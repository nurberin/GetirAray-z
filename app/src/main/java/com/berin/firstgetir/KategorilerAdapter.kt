package com.berin.firstgetir

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.berin.firstgetir.databinding.CardTasarimBinding

class KategorilerAdapter(var nContext:Context, var kategorilerListesi:List<Kategoriler>)
    :RecyclerView.Adapter<KategorilerAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(cardTasarimBinding: CardTasarimBinding):RecyclerView.ViewHolder(cardTasarimBinding.root){

        var tasarim:CardTasarimBinding
        init {
            this.tasarim = cardTasarimBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(nContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return kategorilerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kategori = kategorilerListesi.get(position)

        holder.tasarim.textViewKategoriAdi.text=kategori.kategori_adi
        holder.tasarim.imageViewKategori.setImageResource(
            nContext.resources.getIdentifier(kategori.kategori_resim_adi,"drawable",nContext.packageName))

        holder.tasarim.kategoriCardview.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.kategoriDetayGecis(kategori)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

}
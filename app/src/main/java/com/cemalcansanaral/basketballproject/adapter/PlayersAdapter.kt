package com.cemalcansanaral.basketballproject.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.cemalcansanaral.basketballproject.databinding.PlayersCardDesignBinding
import com.cemalcansanaral.basketballproject.entity.Players
import com.cemalcansanaral.basketballproject.fragment.HomepageFragmentDirections
import com.squareup.picasso.Picasso

class PlayersAdapter(var mContext : Context, var playersList : List<Players>) :
    RecyclerView.Adapter<PlayersAdapter.CardDesign>() {

    inner class CardDesign(playersCardDesignBinding: PlayersCardDesignBinding) :
        RecyclerView.ViewHolder(playersCardDesignBinding.root) {
        var playersCardDesignBinding : PlayersCardDesignBinding

        init {
            this.playersCardDesignBinding = playersCardDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = PlayersCardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesign(design)
    }

    override fun getItemCount(): Int {
        return playersList.size
    }

    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        var player = playersList.get(position)
        var d = holder.playersCardDesignBinding
        d.playersObject = player

        val ikeAnigbou = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/4066424.png&w=350&h=254"
        val ronBaker = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2580349.png&w=350&h=254"
        val jabariBird = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3064308.png&w=350&h=254"
        val marshonBrooks = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/6428.png&w=350&h=254"
        val lorenzoBrown = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2528787.png&w=350&h=254"
        val omriCasspi = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3554.png&w=350&h=254"
        val alexAbrines = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2995702.png&w=350&h=254"
        val tylerDavis = "https://a.espncdn.com/combiner/i?img=/i/headshots/nfl/players/full/3914240.png&w=350&h=254"
        val keenanEvans = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3133629.png&w=350&h=254"
        var marcinGortat = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2758.png&w=350&h=254"
        val andrewBogut = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2747.png&w=350&h=254"
        val amirJohnson = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2769.png&w=350&h=254"
        val malachiRichardson = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3934663.png&w=350&h=254"
        val zachLofton = "https://i.hizliresim.com/q4jpxuz.png"
        val kostaKoufos = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3444.png&w=350&h=254"
        val billyPreston = "https://a.espncdn.com/combiner/i?img=/i/headshots/recruiting/ncb/players/full/190946.png&w=350&h=254"
        val zhouQi = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3892894.png&w=350&h=254"
        val zachRandolph = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/1017.png&w=350&h=254"
        val djStephens = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2489563.png&w=350&h=254"
        val milosTeodosic = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/4192.png&w=350&h=254"
        val garyTrentJr = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/4277843.png&w=350&h=254"
        val michaelSmith = "https://i.hizliresim.com/khum5co.png"
        val johnMorton = "https://i.hizliresim.com/olda86t.png"
        val howardWright = "https://i.hizliresim.com/gs1gw7h.png"
        val michaelAnsley = "https://i.hizliresim.com/mworttn.png"
        if (player.id == 14){
            Picasso.get().load(ikeAnigbou).into(d.imageViewPlayerPicture)
        } else if (player.id == 25) {
            Picasso.get().load(ronBaker).into(d.imageViewPlayerPicture)
        } else if (player.id == 47) {
            Picasso.get().load(jabariBird).into(d.imageViewPlayerPicture)
        } else if (player.id == 67) {
            Picasso.get().load(marshonBrooks).into(d.imageViewPlayerPicture)
        } else if (player.id == 71) {
            Picasso.get().load(lorenzoBrown).into(d.imageViewPlayerPicture)
        } else if (player.id == 90) {
            Picasso.get().load(omriCasspi).into(d.imageViewPlayerPicture)
        } else if (player.id == 1) {
            Picasso.get().load(alexAbrines).into(d.imageViewPlayerPicture)
        } else if (player.id == 119) {
            Picasso.get().load(tylerDavis).into(d.imageViewPlayerPicture)
        } else if (player.id == 149) {
            Picasso.get().load(keenanEvans).into(d.imageViewPlayerPicture)
        } else if (player.id == 179) {
            Picasso.get().load(marcinGortat).into(d.imageViewPlayerPicture)
        } else if (player.id == 1593) {
            Picasso.get().load(andrewBogut).into(d.imageViewPlayerPicture)
        } else if (player.id == 241) {
            Picasso.get().load(amirJohnson).into(d.imageViewPlayerPicture)
        } else if (player.id == 392) {
            Picasso.get().load(malachiRichardson).into(d.imageViewPlayerPicture)
        } else if (player.id == 281) {
            Picasso.get().load(zachLofton).into(d.imageViewPlayerPicture)
        } else if (player.id == 263) {
            Picasso.get().load(kostaKoufos).into(d.imageViewPlayerPicture)
        } else if (player.id == 382) {
            Picasso.get().load(billyPreston).into(d.imageViewPlayerPicture)
        } else if (player.id == 384) {
            Picasso.get().load(zhouQi).into(d.imageViewPlayerPicture)
        } else if (player.id == 388) {
            Picasso.get().load(zachRandolph).into(d.imageViewPlayerPicture)
        } else if (player.id == 430) {
            Picasso.get().load(djStephens).into(d.imageViewPlayerPicture)
        } else if (player.id == 437) {
            Picasso.get().load(milosTeodosic).into(d.imageViewPlayerPicture)
        } else if (player.id == 448) {
            Picasso.get().load(garyTrentJr).into(d.imageViewPlayerPicture)
        } else if (player.id == 494) {
            Picasso.get().load(michaelSmith).into(d.imageViewPlayerPicture)
        } else if (player.id == 495) {
            Picasso.get().load(johnMorton).into(d.imageViewPlayerPicture)
        } else if (player.id == 496) {
            Picasso.get().load(howardWright).into(d.imageViewPlayerPicture)
        } else if (player.id == 497) {
            Picasso.get().load(michaelAnsley).into(d.imageViewPlayerPicture)
        }

        d.playersCard.setOnClickListener {
            val transition = HomepageFragmentDirections.playerDetailTransition(player)
            Navigation.findNavController(it).navigate(transition)
        }
    }

}
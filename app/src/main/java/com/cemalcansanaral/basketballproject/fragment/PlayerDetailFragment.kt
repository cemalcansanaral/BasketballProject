package com.cemalcansanaral.basketballproject.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.cemalcansanaral.basketballproject.R
import com.cemalcansanaral.basketballproject.databinding.FragmentPlayerDetailBinding
import com.cemalcansanaral.basketballproject.viewmodel.PlayerDetailFragmentViewModel
import com.squareup.picasso.Picasso

class PlayerDetailFragment : Fragment() {
    private lateinit var design : FragmentPlayerDetailBinding
    private lateinit var viewModel : PlayerDetailFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_player_detail, container, false)

        val bundle : PlayerDetailFragmentArgs by navArgs()
        val comingPlayer = bundle.playerObject
        Log.e("ComingPlayer","Comingplayer$comingPlayer")

        design.playerDetailFragment = this

        design.playerObject = comingPlayer
        val ikeAnigbou = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/4066424.png&w=350&h=254"
        val ronBaker = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2580349.png&w=350&h=254"
        val jabariBird = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3064308.png&w=350&h=254"
        val marshonBrooks = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/6428.png&w=350&h=254"
        val lorenzoBrown = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2528787.png&w=350&h=254"
        val omriCasspi = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3554.png&w=350&h=254"
        val alexAbrines = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2995702.png&w=350&h=254"
        val tylerDavis = "https://a.espncdn.com/combiner/i?img=/i/headshots/nfl/players/full/3914240.png&w=350&h=254"
        val keenanEvans = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/3133629.png&w=350&h=254"
        val marcinGortat = "https://a.espncdn.com/combiner/i?img=/i/headshots/nba/players/full/2758.png&w=350&h=254"
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
        if (comingPlayer.id == 14){
            Picasso.get().load(ikeAnigbou).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 25) {
            Picasso.get().load(ronBaker).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 47) {
            Picasso.get().load(jabariBird).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 67) {
            Picasso.get().load(marshonBrooks).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 71) {
            Picasso.get().load(lorenzoBrown).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 90) {
            Picasso.get().load(omriCasspi).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 1) {
            Picasso.get().load(alexAbrines).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 119) {
            Picasso.get().load(tylerDavis).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 149) {
            Picasso.get().load(keenanEvans).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 179) {
            Picasso.get().load(marcinGortat).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 1593) {
            Picasso.get().load(andrewBogut).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 241) {
            Picasso.get().load(amirJohnson).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 392) {
            Picasso.get().load(malachiRichardson).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 281) {
            Picasso.get().load(zachLofton).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 263) {
            Picasso.get().load(kostaKoufos).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 382) {
            Picasso.get().load(billyPreston).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 384) {
            Picasso.get().load(zhouQi).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 388) {
            Picasso.get().load(zachRandolph).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 430) {
            Picasso.get().load(djStephens).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 437) {
            Picasso.get().load(milosTeodosic).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 448) {
            Picasso.get().load(garyTrentJr).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 494) {
            Picasso.get().load(michaelSmith).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 495) {
            Picasso.get().load(johnMorton).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 496) {
            Picasso.get().load(howardWright).into(design.imageViewPlayersDetail)
        } else if (comingPlayer.id == 497) {
            Picasso.get().load(michaelAnsley).into(design.imageViewPlayersDetail)
        }
        return design.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : PlayerDetailFragmentViewModel by viewModels()
        this.viewModel = tempViewModel
    }

}
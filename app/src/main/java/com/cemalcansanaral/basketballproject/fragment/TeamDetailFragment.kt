package com.cemalcansanaral.basketballproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.cemalcansanaral.basketballproject.R
import com.cemalcansanaral.basketballproject.databinding.FragmentTeamDetailBinding
import com.cemalcansanaral.basketballproject.viewmodel.PlayerDetailFragmentViewModel
import com.cemalcansanaral.basketballproject.viewmodel.TeamsDetailFragmentViewModel
import com.squareup.picasso.Picasso

class TeamDetailFragment : Fragment() {
    private lateinit var design : FragmentTeamDetailBinding
    private lateinit var viewModel : TeamsDetailFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_team_detail, container, false)

        val bundle : TeamDetailFragmentArgs by navArgs()
        val comingTeam = bundle.teamObject

        design.teamDetailFragment = this
        design.teamObject = comingTeam

        val atlantaHawks = "https://upload.wikimedia.org/wikipedia/tr/thumb/2/24/Atlanta_Hawks_logo.svg/200px-Atlanta_Hawks_logo.svg.png"
        val bostonCeltics = "https://upload.wikimedia.org/wikipedia/tr/thumb/8/8f/Boston_Celtics.svg/1024px-Boston_Celtics.svg.png"
        val brooklynNets = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Brooklyn_Nets_newlogo.svg/800px-Brooklyn_Nets_newlogo.svg.png"
        val charlotteHornets = "https://upload.wikimedia.org/wikipedia/tr/thumb/c/c4/Charlotte_Hornets_%282014%29.svg/1024px-Charlotte_Hornets_%282014%29.svg.png"
        val chicagoBulls = "https://upload.wikimedia.org/wikipedia/tr/d/d8/Chicago_Bulls_logo.png"
        val clevelandCavaliers = "https://wqkt.com/wp-content/uploads/2020/12/cavs-logo.png"
        val dallasMavericks = "https://upload.wikimedia.org/wikipedia/tr/b/bf/Dallas_Mavericks.png"
        val denverNuggets = "https://upload.wikimedia.org/wikipedia/tr/thumb/d/d9/Denver_Nuggets_Logo.svg/1024px-Denver_Nuggets_Logo.svg.png"
        val detroitPistons = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Pistons_logo17.svg/1024px-Pistons_logo17.svg.png"
        val goldenStateWarriors = "https://upload.wikimedia.org/wikipedia/tr/3/35/Golden_State_Warriors_2010.gif"
        val houstonRockets = "https://upload.wikimedia.org/wikipedia/tr/d/de/Houston_Rockets.png"
        val indianaPacers = "https://upload.wikimedia.org/wikipedia/tr/thumb/1/1b/Indiana_Pacers.svg/1024px-Indiana_Pacers.svg.png"
        val laClippers = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/The_official_logo_of_the_Los_Angeles_Clippers.svg/1024px-The_official_logo_of_the_Los_Angeles_Clippers.svg.png"
        val losAngelesLakers = "https://upload.wikimedia.org/wikipedia/tr/f/f6/Lakers_Belirtke.png"
        val memphisGrizzlies = "https://upload.wikimedia.org/wikipedia/tr/c/c8/Memphis_Grizzlies.png"
        val miamiHeat = "https://upload.wikimedia.org/wikipedia/tr/b/b2/Miami_Heat_logo.png"
        val milwaukeeBucks = "https://i.hizliresim.com/32gezy0.png"
        val minnesotaTimberwolves = "https://i.hizliresim.com/edf8g54.png"
        val newOrleansPelicans = "https://upload.wikimedia.org/wikipedia/tr/2/21/New_Orleans_Pelicans.png"
        val newYorkKnicks = "https://i.hizliresim.com/wj9dpnw.png"
        val oklahomaCityThunder = "https://upload.wikimedia.org/wikipedia/tr/f/f6/OKC_Thunder.png"
        val orlandoMagic = "https://upload.wikimedia.org/wikipedia/tr/9/96/Orlando_Magic_2010.gif"
        val philadelphia76Ers = "https://i.hizliresim.com/j09l4ne.png"
        val phoenixSuns = "https://upload.wikimedia.org/wikipedia/tr/e/e7/Phoenix_Suns_2013_LOGO.png"
        val portlandTrailBlazers = "https://i.hizliresim.com/ce7jvm8.png"
        val sacramentoKings = "https://i.hizliresim.com/gdv0egf.png"
        val sanAntenioSpurs = "https://upload.wikimedia.org/wikipedia/tr/d/d6/San_Antonio_Spurs.svg.png"
        val torontoRaptors = "https://upload.wikimedia.org/wikipedia/tr/f/f0/Toronto-raptors-new-logo.gif"
        val utahJazz = "https://i.hizliresim.com/bfwqrd3.png"
        val washingtonWizards = "https://i.hizliresim.com/d4htlj8.png"
        if (comingTeam.id == 1){
            Picasso.get().load(atlantaHawks).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 2) {
            Picasso.get().load(bostonCeltics).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 3) {
            Picasso.get().load(brooklynNets).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 4) {
            Picasso.get().load(charlotteHornets).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 5) {
            Picasso.get().load(chicagoBulls).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 6) {
            Picasso.get().load(clevelandCavaliers).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 7) {
            Picasso.get().load(dallasMavericks).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 8) {
            Picasso.get().load(denverNuggets).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 9) {
            Picasso.get().load(detroitPistons).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 10) {
            Picasso.get().load(goldenStateWarriors).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 11) {
            Picasso.get().load(houstonRockets).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 12) {
            Picasso.get().load(indianaPacers).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 13) {
            Picasso.get().load(laClippers).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 14) {
            Picasso.get().load(losAngelesLakers).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 15) {
            Picasso.get().load(memphisGrizzlies).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 16) {
            Picasso.get().load(miamiHeat).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 17) {
            Picasso.get().load(milwaukeeBucks).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 18) {
            Picasso.get().load(minnesotaTimberwolves).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 19) {
            Picasso.get().load(newOrleansPelicans).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 20) {
            Picasso.get().load(newYorkKnicks).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 21) {
            Picasso.get().load(oklahomaCityThunder).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 22) {
            Picasso.get().load(orlandoMagic).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 23) {
            Picasso.get().load(philadelphia76Ers).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 24) {
            Picasso.get().load(phoenixSuns).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 25) {
            Picasso.get().load(portlandTrailBlazers).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 26) {
            Picasso.get().load(sacramentoKings).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 27) {
            Picasso.get().load(sanAntenioSpurs).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 28) {
            Picasso.get().load(torontoRaptors).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 29) {
            Picasso.get().load(utahJazz).into(design.imageViewTeamsDetail)
        } else if (comingTeam.id == 30) {
            Picasso.get().load(washingtonWizards).into(design.imageViewTeamsDetail)
        }
        return design.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : TeamsDetailFragmentViewModel by viewModels()
        this.viewModel = tempViewModel
    }
}
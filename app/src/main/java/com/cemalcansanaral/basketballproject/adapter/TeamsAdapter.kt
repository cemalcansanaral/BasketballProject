package com.cemalcansanaral.basketballproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.cemalcansanaral.basketballproject.databinding.TeamsCardDesignBinding
import com.cemalcansanaral.basketballproject.entity.Teams
import com.cemalcansanaral.basketballproject.fragment.HomepageFragmentDirections
import com.cemalcansanaral.basketballproject.fragment.TeamsFragmentDirections
import com.squareup.picasso.Picasso

class TeamsAdapter (var mContext : Context, var teamsList : List<Teams>) :
    RecyclerView.Adapter<TeamsAdapter.CardDesign>() {

    inner class CardDesign(teamsCardDesignBinding: TeamsCardDesignBinding) :
        RecyclerView.ViewHolder(teamsCardDesignBinding.root) {
            var teamsCardDesignBinding : TeamsCardDesignBinding

            init {
                this.teamsCardDesignBinding = teamsCardDesignBinding
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = TeamsCardDesignBinding.inflate(layoutInflater,parent,false)
        return CardDesign(design)
    }

    override fun getItemCount(): Int {
        return teamsList.size
    }


    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        var team = teamsList.get(position)
        var d = holder.teamsCardDesignBinding
        d.teamsObject = team

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
        ifPicasso(1,atlantaHawks,d,team)
        ifPicasso(2,bostonCeltics,d,team)
        ifPicasso(3,brooklynNets,d,team)
        ifPicasso(4,charlotteHornets,d,team)
        ifPicasso(5,chicagoBulls,d,team)
        ifPicasso(6,clevelandCavaliers,d,team)
        ifPicasso(7,dallasMavericks,d,team)
        ifPicasso(8,denverNuggets,d,team)
        ifPicasso(9,detroitPistons,d,team)
        ifPicasso(10,goldenStateWarriors,d,team)
        ifPicasso(11,houstonRockets,d,team)
        ifPicasso(12,indianaPacers,d,team)
        ifPicasso(13,laClippers,d,team)
        ifPicasso(14,losAngelesLakers,d,team)
        ifPicasso(15,memphisGrizzlies,d,team)
        ifPicasso(16,miamiHeat,d,team)
        ifPicasso(17,milwaukeeBucks,d,team)
        ifPicasso(18,minnesotaTimberwolves,d,team)
        ifPicasso(19,newOrleansPelicans,d,team)
        ifPicasso(20,newYorkKnicks,d,team)
        ifPicasso(21,oklahomaCityThunder,d,team)
        ifPicasso(22,orlandoMagic,d,team)
        ifPicasso(23,philadelphia76Ers,d,team)
        ifPicasso(24,phoenixSuns,d,team)
        ifPicasso(25,portlandTrailBlazers,d,team)
        ifPicasso(26,sacramentoKings,d,team)
        ifPicasso(27,sanAntenioSpurs,d,team)
        ifPicasso(28,torontoRaptors,d,team)
        ifPicasso(29,utahJazz,d,team)
        ifPicasso(30,washingtonWizards,d,team)

        d.teamsCard.setOnClickListener {
            val transition = TeamsFragmentDirections.teamsDetailTransition(team)
            Navigation.findNavController(it).navigate(transition)
        }

    }

    fun ifPicasso(id : Int, url : String, d : TeamsCardDesignBinding, team : Teams){
        if (team.id == id) {
            Picasso.get().load(url).into(d.imageViewTeamsPicture)
        }
    }
}
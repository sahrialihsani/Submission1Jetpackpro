package com.sahrial.submission_1_jetpackpro.data

import android.content.Context
import android.graphics.Movie
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.sahrial.submission_1_jetpackpro.R
import com.sahrial.submission_1_jetpackpro.model.Movie_model

object MovieData {
    const val MOV = "MOV"
    const val TV = "TV"
    fun setImage(context: Context, imagePath: Int, imageView: ImageView) {
        Glide.with(context).clear(imageView)
        Glide.with(context).load(imagePath).into(imageView)
    }
    fun listDataMovie(): List<Movie_model>{
        val movie = ArrayList<Movie_model>()

        movie.add(
            Movie_model(
                "Film1",
                "Guardian of Galaxy Vol 2",
                "Action, Adventure, Comedy",
                "2017",
                "The Guardians struggle to keep together as a team while dealing with their personal family issues, notably Star-Lord's encounter with his father the ambitious celestial being Ego.",
                R.drawable.gog,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film2",
                "Monster Hunter",
                "Action, Adventure, Fantasy",
                "2020",
                "When Lt. Artemis and her loyal soldiers are transported to a new world, they engage in a desperate battle for survival against enormous enemies with incredible powers. Feature film based on the video game by Capcom.",
                R.drawable.monsterhunter,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film3",
                "Shazam!",
                "Action, Adventure, Fantasy",
                "2019",
                "A newly fostered young boy in search of his mother instead finds unexpected super powers and soon gains a powerful enemy. ",
                R.drawable.shazam,
                R.drawable.background
            )
        )

        movie.add(
            Movie_model(
                "Film4",
                "Hard Kill",
                "Action, Thriller",
                "2020",
                "The work of billionaire tech CEO Donovan Chalmers (Willis) is so valuable that he hires mercenaries to protect it, and a terrorist group kidnaps his daughter just to get it.  ",
                R.drawable.hardkill,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film5",
                "Doctor Strange",
                "Action, Adventure, Fantasy",
                "2016",
                "While on a journey of physical and spiritual healing, a brilliant neurosurgeon is drawn into the world of the mystic arts.",
                R.drawable.dstrange,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film6",
                "Justice League",
                "Action, Adventure, Fantasy",
                "2017",
                "Fueled by his restored faith in humanity and inspired by Superman's selfless act, Bruce Wayne enlists the help of his new-found ally, Diana Prince, to face an even greater enemy. ",
                R.drawable.justiceleague,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film7",
                "Black and Blue",
                "Action, Crime, Thriller",
                "2019",
                "A rookie New Orleans police officer is forced to balance her identity as a black woman after she witnesses two corrupt cops committing murder. ",
                R.drawable.blackandblue,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film8",
                "Tom and Jerry",
                "Animation, Adventure, Fantasy",
                "2021",
                "Adaptation of the classic Hanna-Barbera property, which reveals how Tom and Jerry first meet and form their rivalry. ",
                R.drawable.tomandjerry,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film9",
                "Black Panther",
                "Action, Adventure, Sci-Fi",
                "2018",
                "T'Challa, heir to the hidden but advanced kingdom of Wakanda, must step forward to lead his people into a new future and must confront a challenger from his country's past. ",
                R.drawable.blackpanther,
                R.drawable.background
            )
        )
        movie.add(
            Movie_model(
                "Film10",
                "Avengers Endgame",
                "Action, Adventure, Drama",
                "2019",
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.  ",
                R.drawable.avengers,
                R.drawable.background
            )
        )


        return movie
    }
    fun listDataTV(): List<Movie_model>{
        val tv = ArrayList<Movie_model>()

        tv.add(
            Movie_model(
                "TV1",
                "The Great",
                "Biography, Comedy, Drama",
                "2020 -",
                "A royal woman living in rural Russia during the 18th century is forced to choose between her own personal happiness and the future of Russia, when she marries an Emperor. ",
                R.drawable.thegreat,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV2",
                "Colony",
                "Action, Adventure, Drama",
                "2016-2018",
                "In the wake of a mysterious alien invasion, a family fights to stay together in a new world order.",
                R.drawable.colony,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV3",
                "Between Two Worlds",
                "Drama",
                "2017",
                "No desc founded",
                R.drawable.beetweentw,
                R.drawable.background2
            )
        )

        tv.add(
            Movie_model(
                "TV4",
                "Don't",
                "Comedy, Game-show",
                "2020 -",
                "A game show that offers contestants the chance to win cash by tackling hilarious tasks, each with the simple rule: \"DON'T.\" ",
                R.drawable.dont,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV5",
                "Angel",
                "Action, Drama, Fantasy",
                "1999-2004",
                "The vampire Angel, cursed with a soul, moves to Los Angeles and aids people with supernatural-related problems while questing for his own redemption. ",
                R.drawable.angel,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV6",
                "Servant",
                "Drama, Horror, Mystery",
                "2019 -",
                "A Philadelphia couple is in mourning after an unspeakable tragedy creates a rift in their marriage and opens the door for a mysterious force to enter their home.",
                R.drawable.servant,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV7",
                "Vikings",
                "Action, Adventure, Drama",
                "2013-2020",
                "Vikings transports us to the brutal and mysterious world of Ragnar Lothbrok, a Viking warrior and farmer who yearns to explore - and raid - the distant shores across the ocean. ",
                R.drawable.viking,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV8",
                "Sherlock",
                "Crime, Drama, Mystery",
                "2010-2017",
                "A modern update finds the famous sleuth and his doctor partner solving crime in 21st century London. ",
                R.drawable.sherlock,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV9",
                "Truth Seeker",
                "Comedy, Drama, Fantasy",
                "2020",
                "Truth Seekers \n" +
                        "A team of part-time paranormal investigators use homemade gizmos to track the supernatural, sharing their adventures online. As their haunted stake outs become more terrifying they begin to uncover an unimaginable, apocalyptic conspiracy",
                R.drawable.truthseeker,
                R.drawable.background2
            )
        )
        tv.add(
            Movie_model(
                "TV10",
                "A List",
                "Crime, Drama, Mystery",
                "2018-",
                "Mia arrives at an idyllic summer camp expecting to be Queen Bee, but the \"holiday of a lifetime\" turns into a twisted nightmare. ",
                R.drawable.alist,
                R.drawable.background2
            )
        )




        return tv
    }
}
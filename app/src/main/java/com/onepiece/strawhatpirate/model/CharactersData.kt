package com.onepiece.strawhatpirate.model

import com.onepiece.strawhatpirate.R

object CharactersData {
    private val characterNames = arrayOf(
        "Monkey D. Luffy",
        "Roronoa Zoro",
        "Nami",
        "Usopp",
        "Sanji",
        "Tony Tony Chopper",
        "Nico Robin",
        "Franky",
        "Brook",
        "Jinbe"
    )

    private val characterDetails = arrayOf(
        "Monkey D. Luffy, also known as \"Straw Hat Luffy\" and commonly as \"Straw Hat\", is the founder and captain of the increasingly infamous and powerful Straw Hat Pirates, as well as one of its top fighters. His lifelong dream is to become the Pirate King by finding the legendary treasure left behind by the late Gol D. Roger. He believes that being Pirate King means having the most freedom in the world.\n" +
                "\n" +
                "Born in Foosha Village, Luffy is the son of the Revolutionary leader Monkey D. Dragon, the grandson of the Marine hero Monkey D. Garp, the sworn brother of late \"Fire Fist\" Portgas D. Ace and Revolutionary Chief-of-Staff Sabo, and the foster son of Curly Dadan. He is one of the few people in the world that carry the Will of D.",
        "Roronoa Zoro, also known as \"Pirate Hunter\" Zoro, is the combatant of the Straw Hat Pirates, and one of their two swordsmen. Formerly a bounty hunter, he is the second member of the crew and the first to join, doing so in the Romance Dawn Arc.\n" +
                "\n" +
                "As a master of Santoryu, a swordsmanship style which he created during his childhood training in Shimotsuki Village, Zoro is among the four most powerful combatants of the Straw Hats, alongside Luffy, Sanji and Jinbe. His dream is to become the greatest swordsman in the world, in order to honor a promise he made to his deceased childhood friend Kuina.",
        "\"Cat Burglar\" Nami is the navigator of the Straw Hat Pirates. She is the third member of the crew and the second to join, doing so during the Orange Town Arc. She is the adoptive sister of Nojiko after the two were orphaned and taken in by Bell-mère.\n" +
                "\n" +
                "She was formerly a member of the Arlong Pirates and initially joined the Straw Hats so that she could rob them in order to buy back her village from Arlong. However, she legitimately joined the Straw Hats after they rebelled against and defeated Arlong. Her dream is to make a map of the entire world.",
        "\"God\" Usopp is the sniper of the Straw Hat Pirates. He is the fourth member of the crew and the third to join, doing so at the end of the Syrup Village Arc. Although he left the crew during the Water 7 Arc, he rejoined at the end of the Post-Enies Lobby Arc.\n" +
                "\n" +
                "Usopp was born and raised in Syrup Village, serving as captain of the Usopp Pirates and being Kaya's close friend. After working with the Straw Hats to defeat Kuro and the Black Cat Pirates, he was invited to join the crew. Despite his normal cowardice, Usopp dreams of becoming a brave warrior of the sea just like his father, Yasopp, and lives every day in pursuit of living up to this dream.",
        "\"Black Leg\" Sanji, born as Vinsmoke Sanji, is the cook of the Straw Hat Pirates. He is the fifth member of the crew and the fourth to join, doing so at the end of the Baratie Arc.\n" +
                "\n" +
                "Born as the third son and fourth child of the Vinsmoke Family] (thus making him a prince of the Germa Kingdom), he disowned his family twice, once in his youth and again after reuniting with them as an adult. After fleeing the Vinsmokes as a child, he eventually entered the care of Zeff as the sous chef of the Baratie, where he would remain until he met Luffy, who convinced him to join his crew.\n" +
                "\n" +
                "His dream is to find the rumored chef's paradise, All Blue, which is where East Blue, West Blue, North Blue, and South Blue meet, along with their wildlife. He is one of the top four fighters of the Straw Hats, alongside Luffy, Zoro, and Jinbe.",
        "Tony Tony Chopper, also known as \"Cotton Candy Lover\" Chopper, is the doctor of the Straw Hat Pirates. He is the sixth member of the crew and the fifth to join, doing so at the end of the Drum Island Arc. He was temporarily forced to join the Foxy Pirates during the Long Ring Long Land Arc, but was quickly returned to Luffy's crew.\n" +
                "\n" +
                "Chopper is a reindeer that ate the Hito Hito no Mi, a Devil Fruit that allows its user to transform into a human hybrid or a human at will. He came from Drum Island and was taught how to be a doctor by his two parental figures, Doctors Hiriluk and Kureha. His dream is to one day become a doctor capable of curing any disease and wants to travel all across the world specifically in the hopes of accomplishing this dream",
        "Nico Robin, also known by her epithet \"Devil Child\" and the \"Light of the Revolution\", is the archaeologist of the Straw Hat Pirates. She is the seventh member of the crew and the sixth to join, doing so at the end of the Arabasta Arc. She temporarily left the crew during the Water 7 Arc, but rejoined during the Enies Lobby Arc.\n" +
                "\n" +
                "Robin ate the Hana Hana no Mi at a young age, giving her the power to reproduce her body parts (or her entire body) on any surface at will. As the sole survivor of the destroyed West Blue island Ohara, she is currently the only person in the world known to have the ability to read and decipher Poneglyphs, a skill which is considered forbidden and threatening to the World Government. She acted as the vice president of Baroque Works as \"Miss All Sunday\", serving and partnering herself directly with the organization's president; the ex-Warlord: Crocodile, who operated under the codename \"Mr. 0\". She was a secondary antagonist of the Arabasta Saga, before joining the Straw Hats. Her dream is to find the Rio Poneglyph which tells the true history of the world, specifically the Void Century.",
        "\"Iron Man\" Franky is the shipwright of the Straw Hat Pirates. He is the eighth member of the crew and the seventh to join, doing so at the end of the Post-Enies Lobby Arc.\n" +
                "\n" +
                "Born \"Cutty Flam\", he chose to go by his nickname of \"Franky\" until eventually permanently discarding his true name per the request of Iceburg to hide his identity. He was originally from South Blue, but was abandoned by his family as a four-year-old child, eventually making his way to Water 7. There he became a member of Tom's Workers, until an incident resulted in his body being heavily damaged and requiring him to augment himself into a cyborg. Upon returning to Water 7, he became the leader of the Franky Family, a group of ship dismantlers..\n" +
                "\n" +
                "Franky and his followers were originally enemies of the Straw Hats at the beginning of the Water 7 Arc, until circumstances forced them to become allies at the end of the same arc and the Enies Lobby Arc. Franky's dream is to create a ship and circumnavigate the world with it, and he built the Thousand Sunny and joined the Straw Hat Pirates to fulfill his dream.",
        "\"Soul King\" Brook is the musician of the Straw Hat Pirates, and one of their two swordsmen. He is the ninth member of the crew and the eighth to join, doing so at the end of the Thriller Bark Arc.\n" +
                "\n" +
                "Brook ate the Yomi Yomi no Mi, which allowed him to return to life after death once. Brook eventually learned to tap deeper into the powers of his Devil Fruit, giving him nominal control over his own soul and the souls of others. His dream is to reunite with his old friend, Laboon, at Reverse Mountain, where he resides with Crocus.\n" +
                "\n" +
                "Originally a member of the Rumbar Pirates, he died and was resurrected through the power of the Yomi Yomi no Mi. However, due to the amount of time it took for his soul to find his body, it was reduced to a skeleton, keeping only his afro intact. Brook drifted alone in the Florian Triangle for 50 years, eventually meeting Luffy and serving as the Straw Hats' ally during the Thriller Bark Arc before officially joining the crew.",
        "\"Knight of the Sea\" Jinbe is the helmsman of the Straw Hat Pirates. He is the tenth member of the crew and the ninth to join, doing so during the Wano Country Arc's Third Act.\n" +
                "\n" +
                "Jinbe is a whale shark fish-man and a powerful master of Fish-Man Karate. His dream is to fulfill his former captain Fisher Tiger's dying wish of coexistence and equality between humans and fish-men. He was a member of the Sun Pirates, eventually becoming its second captain after the death of their original captain, Tiger. He eventually became one of the Seven Warlords of the Sea, though he resigned during the Summit War of Marineford.\n" +
                "\n" +
                "Prior to and amidst said war, Jinbe befriended Monkey D. Luffy, and two years later allied with him and his crew to prevent the New Fish-Man Pirates' coup d'état against the Ryugu Kingdom's Neptune Royal Family. Luffy thereafter invited him to join the Straw Hat Pirates, but Jinbe held it off until severing ties with Big Mom during the Whole Cake Island Arc. After staying behind in Totto Land to protect the Sun Pirates from Big Mom's wrath, Jinbe returned to the Straw Hats during the Wano Country Arc, officially announcing his status as a member of the crew."
    )

    private val characterImages = arrayOf(
            R.drawable.luffy,
            R.drawable.zoro,
            R.drawable.nami,
            R.drawable.usopp,
            R.drawable.sanji,
            R.drawable.chopper,
            R.drawable.robin,
            R.drawable.franky,
            R.drawable.brook,
            R.drawable.jinbe
    )

    private val characterDetailImages = arrayOf(
            R.drawable.luffy_detail,
            R.drawable.zoro_detail,
            R.drawable.nami_detail,
            R.drawable.usopp_detail,
            R.drawable.sanji_detail,
            R.drawable.chopper_detail,
            R.drawable.robin_detail,
            R.drawable.franky_detail,
            R.drawable.brook_detail,
            R.drawable.jinbe_detail
    )

    private val characterOccupations = arrayOf(
            "Captain",
            "Swordsman",
            "Navigator",
            "Sniper",
            "Cook",
            "Doctor",
            "Archaeologist",
            "Shipwright",
            "Musician",
            "Helmsman"
    )

    private val characterBounty = arrayOf(
            "1,500,000,000",
            "320,000,000",
            "66,000,000",
            "200,000,000",
            "330,000,000",
            "100",
            "130,000,000",
            "94,000,000",
            "83,000,000",
            "438,000,000"
    )

    val listData: ArrayList<Character>
        get() {
            val list = arrayListOf<Character>()
            for (position in characterNames.indices) {
                val character = Character(
                        position,
                        characterNames[position],
                        characterDetails[position],
                        characterImages[position]
                )
                list.add(character)
            }
            return list
        }

    fun getDetailData(id: Int) : CharacterDetail {
        return CharacterDetail(
                characterNames[id],
                characterDetails[id],
                characterDetailImages[id],
                characterOccupations[id],
                characterBounty[id]
        )
    }
}
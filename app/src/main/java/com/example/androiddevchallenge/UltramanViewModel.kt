/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.bean.Ultraman

class UltramanViewModel : ViewModel() {
    val ultramans by mutableStateOf(
        listOf(
            Ultraman(
                "Ultraman", "40 m", "35,000 t", "Spacium Beam",
                "An alien of justice who came to Earth as an Inter Galactic Defense Force member from Nebula M78 Land of Light, in pursuit of Space Monster Bemular that escaped while being escorted to the Monster Graveyard. After crashing with SSSP member Hayata, Ultraman merged his life with Hayata’s and decided to stay and fight for the peace of the Earth.",
                R.drawable.ultraman
            ),
            Ultraman(
                "Ultraseven", "40 m", "35,000 t", "Emerium Beam",
                "An alien of justice that visited Earth from Nebula M78 Land of Light. Ultraseven was deeply touched by the act of self-sacrifice of a young earthling who was so considerate of others and gave his life to save his friend, thus Ultraseven decided to stay and fight to defend this wonderful planet and life that lives on from alien invaders.",
                R.drawable.seven
            ),
            Ultraman(
                "Ultraman Jack", "40 m", "35,000 t", "Spacium Beam",
                "Ultraman Jack came from Nebula M78 Land of Light, also called as the “Land of Ultra,” to defend Earth from alien invasions and monsters awaken from sleep. Ultraman Jack skillfully uses the versatile weapon Ultra Bracelet which was given by Ultraseven.\n" +
                    "Ultraman Jack takes the human form of Hideki Go who is a member of the Monster Attack Team “MAT” on Earth.",
                R.drawable.jack
            ),
            Ultraman(
                "Ultraman Ace", "40 m", "45,000 t", "Metalium Beam",
                "Ultraman Ace is a warrior who is said to have particularly many variations of beam moves and psychic abilities among Ultra Heroes. He is second to none, especially in the variety of beam cutters using beam cutters, hence Ultraman Ace is also known as “The Ace of Beam Cutters.” He has two energy sources; one is the Color Timer located on his chest and the other is the Ultra Star located on his forehead. Therefore he is considered to be able to use twice as much energy as other Ultra Heroes so far.",
                R.drawable.ace
            ),
            Ultraman(
                "Ultraman Taro", "53 m", "55,000 t", "Strium Beam",
                "Ultraman Taro is the biological child between Father of Ultra and Mother of Ultra. He is the sixth of the Ultraman Brothers and has horns, that are called “Ultra Horn” on his head and “Taro Bracelet” on his left wrist. Later, Mother of Ultra grants King Bracelet to Taro. His overall strength is extremely high and his combat capability is far superior to any of his brothers.",
                R.drawable.taro
            ),
            Ultraman(
                "Ultraman Leo", "52 m", "48,000 t", "Leo Kick",
                "Ultraman Leo is an alien from Planet L77 of constellation Leo. He grew up with his brother Astra on Planet L77. However, after Planet L77 was destroyed under the attack of Alien Magma, Black Giras and Red Giras, he escaped all alone to Earth. On Earth, he was living as a human being named “Gen Otori”, working at the Jonan Sports Center. When Ultraseven was driven into a corner by Alien Magma and others which appeared on Earth for invation, he transformed into Ultraman Leo and saved Ultraseven. From then on, he joined MAC, and took up the duty of defending Earth in place of Ultraseven who lost the ability to transform.",
                R.drawable.leo
            ),
            Ultraman(
                "Ultraman 80", "50 m", "44,000 t", "Succium Beam",
                "Ultraman 80 is an Inter Galactic Defense Force member who was sent from Nebula M78 Land of Light to protect Earth. He believes that monsters are born from the evil thoughts of human beings, therefore he became a junior high school teacher named Takeshi Yamato to lead children into the right path. His fighting style is speedy and acrobatic. He fights against monsters and evil aliens with his abundant psychic abilities and beam attacks.",
                R.drawable.u80
            ),
            Ultraman(
                "Ultraman Tiga", "53 m", "44,000 t", "Zeppelion Beam",
                "30 million years ago, Tiga, the Giant of Light, protected the ultra-ancient people. After the ultra-ancient civilization died out, Tiga had transformed into a stone statue, but was resurrected when Tiga merged with the pilot Daigo of the GUTS defense team, who possessed the genetics to turn into light. At the same time, something in the world’s equilibrium began to fall apart. Numerous inexplicable beings came to attack from space or other dimensions. Earth in the 21st century faced a crisis of survival.\n" +
                    "Could Daigo and GUTS defeat the myriad enemies threatening humankind? And could they save the earth from destruction.\n" +
                    "A distinguishing feature of the Ultraman Tiga story is that it is not only a science fiction tale on a grand scale, but also a well-crafted human drama. Tiga is portrayed as a “human Ultraman” that unites with the human Daigo, and the development and sufferings of Daigo and the other characters are depicted throughout. The perspective is sometimes also broadened to social issues and environmental issues, making for a story that can be enjoyed by people of various generations.",
                R.drawable.tiga
            ),
            Ultraman(
                "Ultraman Dyna", "55 m", "45,000 t", "Solgent Beam",
                "『Ultraman Dyna』 rests on the same world-view as its predecessor series 『Ultraman Tiga』. The story takes places seven years after the era of 『Tiga』 . After the last episode of 『Tiga』, mankind advances further developments in science and technology. On each of the planets in our solar system they prepare environments in which humans can live, and enter an age of space development based on the neo frontier concept, which expands the observation area further, past the solar system. Humans penetrate space and must deal with various incidents. A mysterious shining light appears, and the series portrays the exploits of Shin Asuka, the youth who gains the power to transform into Ultraman Dyna, and his comrades in the earth defense team SUPER-GUTS.\n" +
                    "In the first half, the producers paid attention to accumulating quality episodes, by using characters full of variety, rich variations in story from episode to episode, and a pendulum-like science fiction mind that cleverly alternates hard and soft stories. In the second half, the stories become more space-centered. Human events surrounding Asuka’s father, who disappeared into space along with the light, the circumstances of the people who live in the space age, and the battle between Dyna ,SUPER-GUTS and invaders who devise various schemes (exemplified by Sphere, who is the antagonist throughout the series) are portrayed powerfully. The series is a traditional and emotional work of SF entertainment.",
                R.drawable.dyna
            ),
            Ultraman(
                "Ultraman Gaia", "55 m", "42,000 t", "Photon Edge",
                "This is the story of the battle of the two Ultraman, Gaia and Agul, who protect the earth from the Root of Destruction, an unprecedented threat prophesized to attack the planet. It is a grand ensemble drama that portrays the conflict over conceptual differences for saving the earth between the youths who transform into Gaia and Agul, Gamu Takayama and Hiroya Fujimiya, and their reconciliation, while at the same time the people around them look from each of their viewpoints at the state of the earth itself and the life forms that live on it.\n" +
                    "In a novel twist, this is the first attempt in the long Ultraman series to create a storyline that places two Ultraman with differing thoughts and positions in the same story. The earth defense team XIG has its own air, ground, and maritime expert teams that mobilize according to developments in each episode, and the use of weapons is realistically depicted, giving the story a true to life feel.\n" +
                    "The settings and character portrayals are persistently realistic throughout, and the result is an impressive and uncompromising SF drama.",
                R.drawable.gaia
            ),
            Ultraman(
                "Ultraman Cosmos", "47 m", "42,000 t", "Full Moon Rect",
                "The year is 2009, eight years after Ultraman Cosmos first visited the earth and met Musashi Haruno.\n" +
                    "The monsters have been moved to a protected area, and are coexisting with humankind.\n" +
                    "One day, a luminescent object comes to earth from space and clings to a monster called Lidorias in the protected area. Lidorias metamorphoses into an ominous figure and runs amok. Musashi, who is a pilot candidate student at the SRC Space Development Center, tries to help Lidorias and falls into an awful predicament, but is saved by Ultraman Cosmos. Musashi unites with Cosmos in one body and rescues Lidorias. Musashi, convinced by this act of bravery and kindness toward a monster, joins the SRC’s special investigation unit TEAM EYES. They battle the enemy called Chaos Header while protecting the monsters.",
                R.drawable.cosmos
            ),
        )
    )

    var currentUltraman: Ultraman? by mutableStateOf(null)

    fun show(ultraman: Ultraman) {
        currentUltraman = ultraman
    }

    fun close() {
        currentUltraman = null
    }
}

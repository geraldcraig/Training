import React from "react";
import "../App.css";
import church from "../images/church.jpeg";
import balloons from "../images/balloons.jpeg";
import drink from "../images/drink.jpeg";

const Attractions = () => {
    return <body>

    <div id="container">

        <main>

            <div id="culture">

                <h1>Culture</h1>

                <img className="zoom" src={church} alt="church"/>

                    <p>Creative cultures flourish in Albuquerque. Home to more than 100 art galleries and studios,
                        Albuquerque offers a variety of fine art,
                        authentic Southwestern jewelry, pottery and contemporary art. Its innovative theater scene spans
                        everything from intimate black-box
                        shows to international festivals. Albuquerque is a favorite cultural destination for visitors
                        from all over the map.</p>

                    <p>Highlights Include:</p>

                    <ul>
                        <li>Indian Pueblo Cultural Center</li>

                        <li>National Hispanic Cultural Center</li>

                        <li>KiMo Theatre</li>

                    </ul>

            </div>

            <div id="balloon">

                <h1>Balloon Rides</h1>

                <img className="zoom" src={balloons} alt="balloons"/>

                    <p>Albuquerque's fantastic weather offers the perfect opportunity to take to the skies.
                        Take a romantic balloon ride and marvel at Albuquerque's blue skies form up close.</p>

                    <p>The annual Albuquerque International Balloon Fiesta takes place every October.</p>

                    <p>Balloon Ride Companies:</p>

                    <ul>
                        <li>Rainbow Ryders Inc</li>

                        <li>Above and Beyond</li>

                        <li>World Balloon</li>

                    </ul>

            </div>

            <div id="nightlife">

                <h1>Nightlife</h1>

                <img className="zoom" src={drink} alt="drink"/>

                    <p>Nightlife in Albuquerque is more than just hitting the club. No matter which entertainment venue
                        you choose or the type of nightowl you are,
                        you'll never spend a dull night in Albuquerque! Enjoy a night on the town in Downtown or Nob
                        Hill, where cocktail bars, breweries,
                        wine bars, restaurants, billiard halls and dance clubs are clustered in walkable areas.
                        Or, indulge your senses at Albuquerque's casinos and resorts, where you will find fantastic
                        concert venues, restaurants, spas and nightlife.
                        Gambling options include table games, slots and bingo.</p>

                    <p>Nightlife Recommendations</p>

                    <ul>
                        <li>1922 Bar & Lounge - The Clyde Hotel</li>

                        <li>360 Lounge - Route 66 Casino Hotel</li>

                        <li>The Adobe Bar - The Historic Taos Inn</li>

                    </ul>

            </div>

            <div id="exercises">


                <p>For more information about your to stay, visit the <a href="https://www.visitalbuquerque.org"
                                                                         target="_blank" className="external-link">Visit
                    Albuquerque</a></p>

            </div>

        </main>

        <footer>

            <p>&copy; Copyright 2022. All Rights Reserved.</p>

            <p><a href="mailto:info@visitabq.org?Subject=Request%20Brochure">info@visitabq.org</a></p>

            <p><a href="tel:18002842282">Call us today at 1-800-284-2282</a></p>

        </footer>

    </div>

    </body>;
};

export default Attractions;
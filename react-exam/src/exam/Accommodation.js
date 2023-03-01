import React from "react";
import "../App.css";
import pool from "../images/pool.jpeg";
import hotel from "../images/hotel.jpeg";

const Accommodation = () => {
    return <body>

    <div id="container">

        <main>

            <h1>Discover the best places to stay in Albuquerque</h1>

            <p>A distinctive Southwestern ambiance and warm, friendly service await you at Albuquerque’s charming and
                affordable hotels and motels.
                Search our database of hotels and B&B's in Albuquerque for properties with amenities such as high-speed
                wi-fi, room service, fine-dining
                restaurants, indoor and outdoor swimming pools, spa services, unique and beautiful architecture, fitness
                centers and welcoming pet policies.</p>

            <p><img src={pool} alt="pool" height="30%" width="30%"/></p>

            <table>
                <tr>
                    <th>Accommodation Name</th>
                    <th>Accommodation Type</th>
                    <th>Location</th>
                    <th>Heritage</th>
                </tr>
                <tr>
                    <td>The Clyde Hotel</td>
                    <td>Hotel</td>
                    <td>Downtown</td>
                    <td>1-505-302-6930</td>
                </tr>
                <tr>
                    <td>Casas De Suenos Old Town Historic Inn</td>
                    <td>B&B</td>
                    <td>Downtown</td>
                    <td>1-505-247-4560</td>
                </tr>
                <tr>
                    <td>Los Poblanos Historic Inn</td>
                    <td>B&B</td>
                    <td>Rio Grande Blvd.</td>
                    <td>1-505-985-5000</td>
                </tr>
                <tr>
                    <td>Adobe Manor</td>
                    <td>Hotel</td>
                    <td>Downtown</td>
                    <td>1-505-836-1617</td>
                </tr>
                <tr>
                    <td>Albuquerque Inn</td>
                    <td>Hotel</td>
                    <td>Downtown</td>
                    <td>1-505-265-9309</td>
                </tr>
                <tr>
                    <td>Albuquerque Marriott Hotel</td>
                    <td>Hotel</td>
                    <td>Uptown</td>
                    <td>1-505-881-6800</td>
                </tr>
            </table>

            <p><img src={hotel} alt="hotel" height="30%" width="30%"/></p>
        </main>

        Place the footer information within this area

        <footer>

            <p>&copy; Copyright 2022. All Rights Reserved.</p>

            <p><a href="mailto:info@visitabq.org?Subject=Request%20Brochure">info@visitabq.org</a></p>

            <p><a href="tel:18002842282">Call us today at 1-800-284-2282</a></p>

        </footer>

    </div>
    </body>;
}

export default Accommodation;
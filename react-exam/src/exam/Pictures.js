import React from "react";
import "../App.css";
import adobe from "../images/adobe.jpeg";
import desert from "../images/desert.jpeg";
import dish from "../images/dish.jpeg";
import fort from "../images/fort.jpeg";
import hills from "../images/hills.jpeg";
import mask from "../images/mask.jpeg";


const Pictures = () => {
    return <body>
    <main>

        <div id="container">

            <h1>Image Gallery of Albuquerque</h1>

            <div className="row">
                <div className="col">
                    <img className="flip" src={adobe} alt="adobe" height="30%" width="30%"/>
                </div>
                <div className="col">
                    <img className="flip" src={desert} alt="desert" height="30%" width="30%"/>
                </div>
                <div className="col">
                    <img className="flip" src={dish} alt="dish" height="30%" width="30%"/>
                </div>
                <div className="col">
                    <img className="flip" src={fort} alt="fort" height="30%" width="30%"/>
                </div>
                <div className="col">
                    <img className="flip" src={hills} alt="hills" height="30%" width="30%"/>
                </div>
                <div className="col">
                    <img className="flip" src={mask} alt="mask" height="30%" width="30%"/>
                </div>
            </div>

            <p></p>


            <div id="contact">

                <h2>Call us today for more information or to request a brochure.</h2>
                <h4>Call us: 1-800-284-2282</h4>
                <h4>Official USA Tourist Website: <a href="https://www.visittheusa.co.uk/"
                                                     target="_blank">visittheusa.co.uk</a></h4>
                <h4>Email us: <a href="mailto:info@visitabq.org?Subject=Request%20Brochure">info@visitabq.org</a></h4>
                <h4>Visit us at: 20 First Plaza NW, Suite 601, Albuquerque, New Mexico 87102</h4>

            </div>

        </div>

    </main>

    <footer>

        <p>&copy; Copyright 2022. All Rights Reserved.</p>

        <p><a href="mailto:info@visitabq.org?Subject=Request%20Brochure">info@visitabq.org</a></p>

        <p><a href="tel:18002842282">Call us today at 1-800-284-2282</a></p>

    </footer>

    </body>;
};

export default Pictures;
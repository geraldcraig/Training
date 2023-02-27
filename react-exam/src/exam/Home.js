import banner from '../images/banner.jpg';


const Home = () => {
    return <body>

    <div id="container">

        <main>

            <div>

                <h1>Welcome To Albuquerque</h1>

                <p>At the heart of New Mexico beats the pulse of a vibrant city. In Albuquerque, diverse cultures,
                    authentic art and dynamic traditions have
                    helped shape our centuries-old story. No matter your interests, the city has countless opportunities
                    for you to explore.
                    Sample traditional New Mexican cuisine that takes minutes to make and hundreds of years to prepare,
                    experience world-class museums,
                    stroll along Central Avenue under the vintage neon glow of Route 66, or soar high above the city in
                    the hot air ballooning capital of the
                    world — a sight sure to change your perspective.</p>


                <p>Immerse yourself in our painted skies, abundant space and more than 310 days of sunshine, which make
                    it possible to ski the slopes of the
                    Sandia Mountains and play a round at one of our award-winning golf courses, all in the same day.
                    Albuquerque is an oasis in the high desert, full of rich history and inspiring ideas.
                    Plan your trip today, and leave Albuquerque viewing your own world in a whole new light.</p>

                <p>
                    Contact us today to
                    <span className="action"> plan your next trip!</span></p>

            </div>

            <div>
                <img src={banner} alt="banner" width="100%" height="100%"/>
            </div>

            <div id="contact">

                <h2>Contact us today for more information or to request a brochure.</h2>
                <h4>Call us: 1-800-284-2282</h4>
                <h4>Official USA Tourist Website: <a href="https://www.visittheusa.co.uk/"
                                                     target="_blank">visittheusa.co.uk</a></h4>
                <h4>Email us: <a href="mailto:info@visitabq.org?Subject=Request%20Brochure">info@visitabq.org</a></h4>
                <h4>Visit us at: 20 First Plaza NW, Suite 601, Albuquerque, New Mexico 87102</h4>

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

export default Home;
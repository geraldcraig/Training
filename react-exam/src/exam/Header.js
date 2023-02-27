import '../App.css';
import {Outlet, Link} from "react-router-dom";
import abq from "../images/abq.png";
import sunset from "../images/sunset.jpeg";

const Header = () => {
    return (
        <>
            <div id="container">
                <header>
                    <Link to="/"><img src={abq} alt="Banner Image" height="30%" width="30%"/></Link>
                </header>

                <nav>
                    <ul>
                        <li><Link to="/">Home</Link></li>
                        <li><Link to="/attractions">Tourist Attractions</Link></li>
                        <li><Link to="/heritage">Cultural Heritage</Link></li>
                        <li><Link to="/accommodation">Places To Stay</Link></li>
                        <li><Link to="/pictures">Pictures</Link></li>
                    </ul>
                </nav>
                <div>
                    <img src={sunset} alt="banner"/>
                </div>
            </div>
            <Outlet/>
        </>
    )
};

export default Header;
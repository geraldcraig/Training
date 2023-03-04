import '../App.css';
import { NavLink } from "react-router-dom";

const Header = () => {
    return (
        <>
            <body>
            <nav className="navbar navbar-expand-sm navbar-dark fixed-top bg-dark">
                <a className="navbar-brand" href="index.html">The Record Store</a>

                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                        aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <ul>
                    <li><NavLink to="/home">Home</NavLink></li>
                    <li><NavLink to="/about">About</NavLink></li>
                    <li><NavLink to="/contact">Contact</NavLink></li>
                    <li><NavLink to="/products">Products</NavLink></li>
                </ul>
            </nav>
            </body>

        </>
    )
};

export default Header;
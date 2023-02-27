import '../App.css';
import { Outlet, Link } from "react-router-dom";

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
                    <li><Link to="/">Home</Link></li>
                    <li><Link to="/about">About</Link></li>
                    <li><Link to="/contact">Contact</Link></li>
                    <li><Link to="/products">Products</Link></li>
                </ul>
            </nav>
            </body>

            <Outlet />
        </>
    )
};

export default Header;
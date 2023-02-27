// import {Outlet, Link} from "react-router-dom";

const Footer = () => {
    return (
        <>
            <nav>
                <ul>
                    <li><Link to="/">Home</Link></li>
                    <li><Link to="/attractions">Tourist Attractions</Link></li>
                    <li><Link to="/heritage">Cultural Heritage</Link></li>
                    <li><Link to="/accommodation">Places To Stay</Link></li>
                    <li><Link to="/pictures">Pictures</Link></li>
                </ul>
            </nav>
            <Outlet/>
        </>
    )
};

export default Footer;
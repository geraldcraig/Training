import { Outlet, NavLink } from "react-router-dom";
import '../App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './Header';
import Footer from './Footer';

const Layout = () => {
    const style = ({isActive}) => ({
        fontWeight: isActive ? 'bold' : 'normal',
    });

    return (
            <>
                <Header />
                <nav>
                <ul>
                    <li>
                        <NavLink to="/">Home</NavLink>
                    </li>
                    <li>
                        <NavLink to="/contact">Contact</NavLink>
                    </li>
                </ul>
                </nav>
                <Outlet />
                <Footer />
            </>
    );
};

export default Layout;
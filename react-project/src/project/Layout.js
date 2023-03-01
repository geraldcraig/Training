import { Outlet, NavLink } from "react-router-dom";
import '../App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import Header from './Header';
import Footer from './Footer';


const Layout = () => {
    const style = ({isActive}) => ({
        fontWeight: isActive ? 'bold' : 'normal',
    });

    return (
        <>
            <div id="container">
                <Header />
                {/*<NavLink to="/"><img src={abq} alt="Banner Image" height="30%" width="30%"/></NavLink>*/}
                <table className="table">
                    <thead>
                    <tr>
                        <th><NavLink to="/home">Home</NavLink></th>
                        <th><NavLink to="/about">About</NavLink></th>
                        <th><NavLink to="/contact">Contact</NavLink></th>
                        <th><NavLink to="/products">Products</NavLink></th>
                        <th><NavLink to="/*">Error</NavLink></th>
                    </tr>
                    </thead>
                </table>
            </div>
            <main>
                <Outlet />
            </main>
            <Footer />
        </>
    );
};

export default Layout;
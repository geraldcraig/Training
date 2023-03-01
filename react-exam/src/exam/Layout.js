import { Outlet, NavLink } from "react-router-dom";
import '../App.css';
import "bootstrap/dist/css/bootstrap.min.css";
import Header from './Header';
import Footer from './Footer';
import abq from '../images/abq.png';

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
                        <th><NavLink to="/attractions">Tourist Attractions</NavLink></th>
                        <th><NavLink to="/heritage">Cultural Heritage</NavLink></th>
                        <th><NavLink to="/accommodation">Places To Stay</NavLink></th>
                        <th><NavLink to="/pictures">Pictures</NavLink></th>
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
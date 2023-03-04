import {Outlet} from "react-router-dom";
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
                <Header/>
            </div>

            <main>
                <Outlet/>
            </main>

            <Footer/>
        </>
    );
};

export default Layout;
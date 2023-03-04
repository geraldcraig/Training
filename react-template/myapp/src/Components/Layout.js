import {Outlet} from "react-router-dom";
import '../App.css';
import Header from './Header';
import Footer from './Footer';

const Layout = () => {

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
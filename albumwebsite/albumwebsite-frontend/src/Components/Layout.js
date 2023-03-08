import { Outlet } from "react-router-dom";
import "../App.css";
import Header from './Header';
import Footer from "./Footer";

const Layout = () => {

    return (
        <>
            <header>
                <h1>Record Website</h1>
            </header>
            <Header />
            <main>
                <Outlet />
            </main>
            <Footer />
        </>
    );
};

export default Layout;
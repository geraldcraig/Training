import { Outlet } from "react-router-dom";
import "../App.css";

const Layout = () => {

    return (
        <>
            <header>
                <h1>Album Website</h1>
            </header>
            <main>
                <Outlet />
            </main>
        </>
    );
};

export default Layout;
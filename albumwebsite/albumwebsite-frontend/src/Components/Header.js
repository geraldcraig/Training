import React from "react";
import {NavLink} from "react-router-dom";

const Header = () => {
    return (
        <nav>
            <div className="container">
                <div className="table-responsive">
                    <table className="table">
                        <thead>
                        <tr>
                            <th><NavLink to="/home">Record Website</NavLink></th>
                            <th><NavLink to="/albums">Top 500 Albums</NavLink></th>
                            <th><NavLink to="/login">Log In</NavLink></th>
                            <th><NavLink to="/register">Register</NavLink></th>
                            <th><NavLink to="/admin">Admin</NavLink></th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </nav>
    );
};

export default Header;
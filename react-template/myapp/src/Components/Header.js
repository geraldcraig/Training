import React from "react";
import {NavLink} from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";


const Header = () => {

    return (
        <>
            <table className="table">
                <thead>
                <tr>
                    <th><NavLink to="/home">Home</NavLink></th>
                    <th><NavLink to="/form">Form</NavLink></th>
                    <th><NavLink to="/list">List</NavLink></th>
                </tr>
                </thead>
            </table>
        </>
    );
};

export default Header;
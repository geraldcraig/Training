import React from "react";
import {NavLink} from "react-router-dom";
import logo from '../images/abq.png';
import headingimage from '../images/sunset.jpeg';


const Header = () => {
    return (
        <>
            <header>
                <a href={"/home"}><img src={logo} alt="Banner Image" style={{height: '10%'}}/></a>
            </header>

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

            <div>
                <img src={headingimage} alt="banner"/>
            </div>
        </>
    );
};

export default Header;
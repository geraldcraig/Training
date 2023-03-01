import React from "react";
import headingimage from '../images/sunset.jpeg';


const Header = () => {
    return (
        <header>
            <div>
                <img src={headingimage} alt="" style={{width: '100%'}}/>
            </div>
        </header>
    )
}


export default Header;
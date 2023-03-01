import {Route, Routes} from "react-router-dom";
import './App.css';
import Layout from "./exam/Layout";
import Home from "./exam/Home";
import Attractions from "./exam/Attractions";
import Heritage from "./exam/Heritage";
import Accommodation from "./exam/Accommodation";
import Pictures from "./exam/Pictures";
import Error from "./exam/Error";


function App() {
    return (
        <div className="App">
            <header>
                <Routes>
                    <Route element={<Layout/>}>
                        <Route path="/home" element={<Home/>}/>
                        <Route path="/attractions" element={<Attractions/>}/>
                        <Route path="/heritage" element={<Heritage/>}/>
                        <Route path="/accommodation" element={<Accommodation/>}/>
                        <Route path="/pictures" element={<Pictures/>}/>
                        <Route path="/*" element={<Error/>}/>
                    </Route>
                </Routes>
            </header>
        </div>
    );
}

export default App;


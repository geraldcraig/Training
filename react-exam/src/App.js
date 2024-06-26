import {Route, Routes} from "react-router-dom";
import './App.css';
import Layout from "./Components/Layout";
import Home from "./Components/Home";
import Attractions from "./Components/Attractions";
import Heritage from "./Components/Heritage";
import Accommodation from "./Components/Accommodation";
import Pictures from "./Components/Pictures";
import Error from "./Components/Error";


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


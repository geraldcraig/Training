import './App.css';
import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Header from "./exam/Header";
import Home from "./exam/Home";
import Attractions from "./exam/Attractions";
import Heritage from "./exam/Heritage";
import Accommodation from "./exam/Accommodation";
import Pictures from "./exam/Pictures";
import Error from "./exam/Error";
import Footer from "./exam/Footer";


export default function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Header/>}>
                    <Route index element={<Home/>}/>
                    <Route path="/attractions" element={<Attractions/>}/>
                    <Route path="/heritage" element={<Heritage/>}/>
                    <Route path="/accommodation" element={<Accommodation/>}/>
                    <Route path="/pictures" element={<Pictures/>}/>
                    <Route path="/*" element={<Error/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App/>);

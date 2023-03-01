import './App.css';
import { Routes, Route} from "react-router-dom";
import Layout from "./project/Layout";
import Home from "./project/Home";
import About from "./project/About";
import Contact from "./project/Contact";
import Products from "./project/Products";
import Error from "./project/Error";

function App() {
    return (
        <div className="App">
        <header>
            <Routes>
                <Route element={<Layout />}>
                    <Route path="/home" element={<Home/>}/>
                    <Route path="/about" element={<About/>}/>
                    <Route path="/contact" element={<Contact/>}/>
                    <Route path="/products" element={<Products/>}/>
                    <Route path="/*" element={<Error/>}/>
                </Route>
            </Routes>
        </header>
        </div>
    );
}

export default App;


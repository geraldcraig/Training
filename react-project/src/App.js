import './App.css';
import { Routes, Route} from "react-router-dom";
import Layout from "./Components/Layout";
import Home from "./Components/Home";
import About from "./Components/About";
import Contact from "./Components/Contact";
import Products from "./Components/Products";
import Error from "./Components/Error";

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


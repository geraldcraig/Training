import './App.css';
import { Routes, Route } from "react-router-dom";
import Contact from './Components/Contact';
import Home from './Components/Home'
import Layout from './Components/Layout';
import NoPage from './Components/NoPage';

function App() {
    return (
        <div className="App">
            <header>
                <Routes>
                    <Route path="/" element={<Layout />}>
                        <Route index element={<Home />}/>
                        <Route path="contact" element={<Contact />}/>
                        <Route path="*" element={<NoPage />}/>
                    </Route>
                </Routes>
            </header>
        </div>
    );
}

export default App;

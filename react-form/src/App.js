import {Route, Routes} from "react-router-dom";
import './App.css';
import Layout from "./Components/Layout";
import Form from './Components/Form';
import Footer from './Components/Footer';


function App() {
  return (
      <div className="App">
        <header>
          <Routes>
            <Route path="/" element={<Layout/>}>
              <Route path="/form" element={<Form/>}/>
              <Route path="/footer" element={<Footer/>}/>
            </Route>
          </Routes>
        </header>
      </div>
  );
}

export default App;


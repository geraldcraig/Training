import {Route, Routes} from "react-router-dom";
import './App.css';
import Layout from "./Components/Layout";
import Home from "./Components/Home";
import Albums from "./Components/Albums";
import Login from "./Components/Login";
import Register from "./Components/Register";
import Admin from "./Components/Admin";
import Error from "./Components/Error";


function App() {
  return (
      <div className="App">
        <header>
          <Routes>
            <Route path="/" element={<Layout/>}>
              <Route path="/home" element={<Home/>}/>
              <Route path="/albums" element={<Albums/>}/>
              <Route path="/login" element={<Login/>}/>
              <Route path="/register" element={<Register/>}/>
              <Route path="/admin" element={<Admin/>}/>
              <Route path="/*" element={<Error/>}/>
            </Route>
          </Routes>
        </header>
      </div>
  );
}

export default App;


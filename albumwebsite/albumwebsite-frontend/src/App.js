import {Route, Routes} from "react-router-dom";
import './App.css';
import Layout from "./Components/Layout";
import Home from "./Components/Home";
import Error from "./Components/Error";


function App() {
  return (
      <div className="App">
        <header>
          <Routes>
            <Route element={<Layout/>}>
              <Route path="/home" element={<Home/>}/>
              <Route path="/*" element={<Error/>}/>
            </Route>
          </Routes>
        </header>
      </div>
  );
}

export default App;


import {Route, Routes} from "react-router-dom";
import './App.css';
import Layout from "./Components/Layout";
import Home from "./Components/Home";
import Form from "./Components/Form";
import List from "./Components/List";
import ItemSearch from "./Components/ItemSearch";
import Error from "./Components/Error";


function App() {
  return (
      <div className="App">
        <header>
          <Routes>
            <Route element={<Layout/>}>
              <Route path="/home" element={<Home/>}/>
              <Route path="/form" element={<Form/>}/>
              <Route path="/list" element={<List/>}/>
              <Route path="/search" element={<ItemSearch/>}/>
              <Route path="/*" element={<Error/>}/>
            </Route>
          </Routes>
        </header>
      </div>
  );
};

export default App;


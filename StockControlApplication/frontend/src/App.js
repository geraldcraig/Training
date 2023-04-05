import './App.css';
import { Routes, Route } from 'react-router-dom';
import Layout from './components/Layout';
import ProductList from './components/ProductList';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Routes>
          <Route element={<Layout />}>
            <Route path='productlist' element={<ProductList />} />
          </Route>
        </Routes>
      </header>
    </div>
  );
}

export default App;

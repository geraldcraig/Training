import './App.css';
import { Routes, Route } from 'react-router-dom';
import Layout from './components/Layout';
import Home from './components/Home';
import Player from './components/Player';
import Model from './components/Model';
import Error from './components/Error';

function App() {
  return (
    <div className="App">
      <header>
      <Routes>
        <Route element={<Layout />}>
          <Route path="home" element={<Home />} />
          <Route path="player" element={<Player />} />
          <Route path="model" element={<Model />} />
          <Route path="*" element={<Error />} />
        </Route>
      </Routes>
      </header>
    </div>
  );
}

export default App;

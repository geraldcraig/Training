import './App.css';
import { useState, useEffect } from 'react';
import { Routes, Route } from 'react-router-dom';
import axios from 'axios';
import Layout from './components/Layout';
import Home from './components/Home';

function App() {

  const [movies, setMovies] = useState();
  const [movie, setMovie] = useState();
  const baseURL = "http://localhost:8080";


  // useEffect(() => {
  //   axios.get(`${baseURL}/api/v1/movies`)
  //   .then(response => {
  //     setMovies(response.data);
  //   })
  //   .catch(error => {
  //     console.log(error);
  //   });
  // }, []);

  const getMovies = async () => {
    try {
      const response = await axios.get(`${baseURL}/api/v1/movies`);
      setMovies(response.data);
    } catch(err) {
      console.log(err);
    }
  }

  useEffect(() => {
    getMovies();
  }, [])

  return (
    <div className="App">
      <header className="App-header">
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="/" element={<Home movies={movies} />} />
        </Route>
      </Routes>
      </header>
    </div>
  );
}

export default App;

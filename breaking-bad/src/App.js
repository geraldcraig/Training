import Header from './components/NavBar'
import SearchBar from './components/SearchBar'
import CharacterList from './components/CharacterList'
import './App.css';

function App() {
  return (
    <div className="App">

        <Header />
        <SearchBar />
        <CharacterList />
    </div>
  );
}

export default App;

import './App.css';
import {useState} from 'react';

// const [firstCity, secondCity, thirdCity] = ["Tokyo", "Tahoe City", "Bend"];
//
// console.log(firstCity);
// console.log(secondCity);
// console.log(thirdCity);

function App() {
    const [emotion, setEmotion] = useState("happy");

    return (
        <div className="App">
            <h1>Current emotion is {emotion}</h1>
            <button onClick={() => setEmotion("sad")}>Sad</button>
            <button onClick={() => setEmotion("excited")}>Excited</button>
        </div>
    );
}

export default App;

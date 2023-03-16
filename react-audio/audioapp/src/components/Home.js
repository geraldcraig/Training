import {useState} from "react";
import 'bootstrap/dist/css/bootstrap.min.css';
// import { Container, Row, Card } from 'react-bootstrap';


function Home() {
    const [inputs, setInputs] = useState({});

    const handleChange = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        setInputs(values => ({...values, [name]: value}))
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(inputs);
    }

    return (
        <form onSubmit={handleSubmit}>
            <fieldset>
                <legend>Audio processing options</legend>
                <select name="stem" value={inputs.stem || ""} onChange={handleChange}>
                    <option value="2stems">2 Stems</option>
                    <option value="4stems">4 stems</option>
                    <option value="5stems">5 stems</option>
                </select>
            </fieldset>

            <fieldset>
                <legend>Select an audio file to process</legend>
                <label>Enter file:
                    <input
                        type="text"
                        name="file"
                        value={inputs.file || ""}
                        onChange={handleChange}
                    />
                </label>
            </fieldset>

            <fieldset>
                <legend>Select location to save stems</legend>
                <label>Enter wav:
                    <input
                        type="file"
                        name="wav"
                        value={inputs.wav || ""}
                        onChange={handleChange}
                    />
                </label>
            </fieldset>

            <input type="submit"/>
        </form>
    )
}

export default Home;
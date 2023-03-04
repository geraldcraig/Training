import {useState} from "react";
import ReactDOM from "react-dom/client";

function Form() {
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
                <select value={inputs.car || ""} onChange={handleChange}>
                    <option value="Ford">Ford</option>
                    <option value="Volvo">Volvo</option>
                    <option value="Fiat">Fiat</option>
                </select>
            </fieldset>

            <fieldset>
                <legend>Select an audio file to process</legend>
                <label>Enter your age:
                    <input
                        type="number"
                        name="age"
                        value={inputs.age || ""}
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

export default Form;
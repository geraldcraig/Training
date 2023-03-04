import {useState} from "react";

function Form() {
    const [inputs, setInputs] = useState({});
    // const [inputs, setInputs] = useState({});

    const handleChange = (event) => {
        const {name, value} = event.target;
        setInputs({...inputs, [name]: value});
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        console.log(inputs);
    }

    const onOptionChange = e => {
        setInputs(e.target.value);
    }

    return (
        <form onSubmit={handleSubmit}>
            <fieldset>
                <legend>Audio processing options</legend>

                {/*<input*/}
                {/*    type="radio"*/}
                {/*    name="topping"*/}
                {/*    value="Medium"*/}
                {/*    id="medium"*/}
                {/*    checked={topping === "Medium"}*/}
                {/*/>*/}
                <label htmlFor="medium">Medium</label>
                {/*<div className="radio">*/}
                    <label>
                        <input
                            type="radio"
                            name="male"
                            value="Male"
                            id="male"
                            checked={inputs.male}
                            onChange={onOptionChange}
                        />
                        Male
                    </label>

                    <input
                        type="radio"
                        name="topping"
                        value="Large"
                        id="large"
                        checked={inputs.large}
                        onChange={handleChange}
                    />
                    <label htmlFor="large">Large</label>

                {/*</div>*/}
                {/*<div className="radio">*/}
                {/*    <label>*/}
                {/*        <input*/}
                {/*            type="radio"*/}
                {/*            value="Female"*/}
                {/*            checked={this.state.selectedOption === "Female"}*/}
                {/*            onChange={this.onValueChange}*/}
                {/*        />*/}
                {/*        Female*/}
                {/*    </label>*/}
                {/*</div>*/}
                {/*<div className="radio">*/}
                {/*    <label>*/}
                {/*        <input*/}
                {/*            type="radio"*/}
                {/*            value="Other"*/}
                {/*            checked={this.state.selectedOption === "Other"}*/}
                {/*            onChange={this.onValueChange}*/}
                {/*        />*/}
                {/*        Other*/}
                {/*    </label>*/}
                {/*</div>*/}
                {/*<select value={inputs.car} onChange={handleChange}>*/}
                {/*<option value="Ford">Ford</option>*/}
                {/*<option value="Volvo">Volvo</option>*/}
                {/*<option value="Fiat">Fiat</option>*/}
                {/*<label>html:*/}
                {/*<input*/}
                {/*    type="radio"*/}
                {/*    id="html"*/}
                {/*    name="html"*/}
                {/*    value={inputs.html}*/}
                {/*    onChange={handleChange}*/}
                {/*/>*/}
                {/*</label>*/}
                {/*<input*/}
                {/*    type="radio"*/}
                {/*    id="css"*/}
                {/*    name="css"*/}
                {/*    value={inputs.css}*/}
                {/*    onChange={handleChange}*/}
                {/*/>*/}
                {/*<input*/}
                {/*    type="radio"*/}
                {/*    id="java"*/}
                {/*    name="java"*/}
                {/*    value={inputs.java}*/}
                {/*    onChange={handleChange}*/}
                {/*/>*/}
                {/*<label htmlFor="html">HTML</label><br/>*/}
                {/*<input type="radio" id="css" name="fav_language" value="CSS"/>*/}
                {/*<label htmlFor="css">CSS</label><br/>*/}
                {/*<input type="radio" id="javascript" name="fav_language" value="JavaScript"/>*/}
                {/*<label htmlFor="javascript">JavaScript</label>*/}
                {/*</select>*/}
            </fieldset>

            <fieldset>
                <legend>Select an audio file to process</legend>
                <label>Enter your age:
                    <input
                        type="number"
                        name="age"
                        value={inputs.age}
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
                        value={inputs.wav}
                        onChange={handleChange}
                    />
                </label>
            </fieldset>

            <input type="submit"/>
        </form>
    )
}

export default Form;